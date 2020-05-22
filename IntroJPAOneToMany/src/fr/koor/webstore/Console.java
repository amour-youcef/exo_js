package fr.koor.webstore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.koor.webstore.business.Command;
import fr.koor.webstore.business.User;

public class Console {

    public static void main(String[] args) throws Exception {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        
        try {
        
            entityManagerFactory = Persistence.createEntityManagerFactory("WebStore");
            entityManager = entityManagerFactory.createEntityManager();
        
            User user = entityManager.find( User.class, 1 );            
            for( Command cmd : user.getCommands() ) {
                System.out.println( cmd );
            }
            
        } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
    }
}
