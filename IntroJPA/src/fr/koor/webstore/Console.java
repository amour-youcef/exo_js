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

			/*
			 * Article art = entityManager.find(Article.class, 5); System.out.println(art);
			 */
			
			EntityTransaction trans = entityManager.getTransaction();
			trans.begin();
			
			Article newArt = new Article("Truc","Bidon",100);
			
			/*
			 * art.setPrice(9); entityManager.persist(art);
			 * 
			 * trans.commit();
			 */

			/*
			 * System.out.println("- Lecture de tous les articles -----------");
			 * 
			 * List<Article> articles = entityManager.createQuery("from Article",
			 * Article.class).getResultList(); for (Article article : articles) {
			 * System.out.println(article); }
			 */

		} finally {
			if (entityManager != null)
				entityManager.close();
			if (entityManagerFactory != null)
				entityManagerFactory.close();
		}

	}

}
