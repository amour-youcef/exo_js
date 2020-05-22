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
		
		Student student = new Student("ESwar");
		Phone phone1 = new Phone("house", "12345679");
		Phone phone2 = new Phone("mobile", "0686062352");
		
		
		phoneNumbers.add(phone1);
		phoneNumbers.add(phone2);
		
		student.setStudentPhoneNumbers(phoneNumbers);
		
		// intéraction avec jpa-hibernat
		
		em.persist(student);
		em.persist(phone1);
		em.persist(phone2);
		
		tx.commit();
		em.close();
		emf.close();
		
		
		System.out.println("OK   ============================ok");
	}
}
