package control;

import entity.Person;
import entity.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserControl {

    private EntityManagerFactory emf;
    private EntityManager em;
    
    public void initEM() {
        emf = Persistence.createEntityManagerFactory("PShowMeTheWayPU");
        em = emf.createEntityManager();
    }

    public void populateTables() {
    
        initEM();
        User u = new User("emil", "1234");
        User u1 = new User("emil0s", "12345");
        em.getTransaction().begin();
        em.persist(u);
        em.persist(u1);
        em.getTransaction().commit();
        
    }
    
    public void addUser(User user) {
        initEM();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

}
