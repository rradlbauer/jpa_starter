package at.spengergasse;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        // persistenceUnitName is defined in src/main/resources/META-INF/persistence.xml
        EntityManager em = Persistence
                .createEntityManagerFactory("quiz")
                .createEntityManager();

        em.close();
    }
}
