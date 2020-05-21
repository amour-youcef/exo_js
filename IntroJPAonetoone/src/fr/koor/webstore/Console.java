package fr.koor.webstore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import fr.koor.webstore.business.User;
import fr.koor.webstore.business.UserInformations;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("WebStore");
			entityManager = entityManagerFactory.createEntityManager();

		    System.out.println("-------------------------------------");
		    User user = entityManager.find( User.class, 1 );
            System.out.println( user );
            UserInformations informations = user.getUserInformations();
            System.out.println( informations );
            
            
            System.out.println("ok");

		} finally {
			if (entityManager != null)
				entityManager.close();
			if (entityManagerFactory != null)
				entityManagerFactory.close();
		}

	}

}
