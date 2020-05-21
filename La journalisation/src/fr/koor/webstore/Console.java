package fr.koor.webstore;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.koor.webstore.buisiness.Article;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("WebStore");
			entityManager = entityManagerFactory.createEntityManager();

//		    System.out.println("-------------------------------------");
//		    
//		    Article art = entityManager.find(Article.class, 5);
//		    System.out.println(art);
			
			EntityTransaction trans = entityManager.getTransaction();
			trans.begin();
			
			Article art = new Article ("test","test",100);
			entityManager.persist(art);
			
			art.setPrice(9);
			
			entityManager.remove(art);
			
			trans.commit();

		} finally {
			if (entityManager != null)
				entityManager.close();
			if (entityManagerFactory != null)
				entityManagerFactory.close();
		}

	}

}
