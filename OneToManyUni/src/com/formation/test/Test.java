package com.formation.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.formation.entities.Address;
import com.formation.entities.Contact;
import com.formation.entities.Student;
import com.objis.demojpa.domaine.Formation;

public class Test {

	public static void main(String[] args) {

		// 1 : Ouverture unit� de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BasePU");

		EntityManager em = emf.createEntityManager();

		// 2 : Ouverture transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// 3 : Instanciation Objet m�tier
//		Formation formation = new Formation("Hibernate");

		Address address1 = new Address("OMR Road","Chennai","Test","600097");
		Student student1 = new Student("Eswar");
		student1.setStudentAddress(address1);
		
		// 4 : Persistance Objet/Relationnel : cr�ation d'un enregistrement en base
		em.persist(student1);
		em.persist(address1);
		// 5 : Fermeture transaction
		tx.commit();

		// 6 : Fermeture unit� de travail JPA
		em.close();
		
		emf.close();
		
		
		System.out.println("ok.....!");
	}
}
