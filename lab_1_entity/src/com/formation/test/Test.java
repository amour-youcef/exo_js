package com.formation.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.formation.entities.Contact;

public class Test {

	public static void main(String[] args){
		
	    // creation des instances
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BasePU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		 // creation des instances
	
		
		Contact contact = new Contact();
		contact.setNom("JAVA");
		contact.setPrenom("Formation");
		contact.setEmail("amour-youcef@hotmail.com");
		
		
		tx.begin();
		
		//integration avec jpa-hibernate
		em.persist(contact);
		
		tx.commit();
		em.close();
		emf.close();
		
		
		System.out.println("OK   §");
	}
}
