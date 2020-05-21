package fr.koor.webstore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("WebStore");
            entityManager = entityManagerFactory.createEntityManager();
		} finally {
			if (entityManager != null)
				entityManager.close();
			if (entityManagerFactory != null)
				entityManagerFactory.close();
		}

	}

}
