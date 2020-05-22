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
        
            Command command = entityManager.find( Command.class, 1 );
            System.out.println( command );

            User user = command.getUser();
            System.out.println( user );

       } finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
    }
}