package com.formation.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.formation.entities.Phone;
import com.formation.entities.Student;

public class Test {

	public static void main(String[] args){
		
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BasePU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		 //creation des instances
		 tx.begin();
		 
		 List<Phone> phoneNumbers = new ArrayList<Phone>();
		 
		 Student student = new Student("ESWAR");
		 
		  
		// intéraction avec jpa-hibernat
		
		tx.commit();
		em.close();
		emf.close();
		
		
		System.out.println("OK   §");
	}
}
