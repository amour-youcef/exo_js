package com.formation.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args){
		
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BasePU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		 //creation des instances
		tx.begin();
		
		// intéraction avec jpa-hibernat
		
		tx.commit();
		em.close();
		emf.close();
		
		
		System.out.println("OK   §");
	}
}
