package at.spengergasse;

import at.spengergasse.entities.DemoEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        // persistenceUnitName is defined in src/main/resources/META-INF/persistence.xml
        EntityManager em = Persistence.createEntityManagerFactory("demo").createEntityManager();
        em.getTransaction().begin();
        em.persist(new DemoEntity("Test"));
        em.getTransaction().commit();

        DemoEntity de = em.find(DemoEntity.class, 1L);
        System.out.println(de);
        em.close();
    }
}
