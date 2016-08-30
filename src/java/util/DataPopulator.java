package util;

import entity.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataPopulator {

    private EntityManagerFactory emf;
    private EntityManager em;

    public void populateTables() {
    
        emf = Persistence.createEntityManagerFactory("PShowMeTheWayPU");
        em = emf.createEntityManager();
        
        User u = new User("emil", "1234");
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
        
    }

}
