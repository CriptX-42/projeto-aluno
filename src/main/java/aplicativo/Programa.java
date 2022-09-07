package aplicativo;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(2, "Joaquim Torres", "joaquim@gmail.com");
        Pessoa p3 = new Pessoa(3, "Ana Maria", "ana@gmail.com");


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(p1);
        entityManager.persist(p2);
        entityManager.persist(p3);

        entityManager.getTransaction().commit();


        System.out.println("pronto");


    }
}
