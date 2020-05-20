package com.formation.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.formation.entities.Address;
import com.formation.entities.Contact;
import com.formation.entities.Phone;
import com.formation.entities.Student;


public class Test {

	public static void main(String[] args) {

		// 1 : Ouverture unit� de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BasePU");

		EntityManager em = emf.createEntityManager();

		// 2 : Ouverture transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// 3 : Instanciation Objet m�tier
        //creation des instance
		
		List<Phone> phoneNumbers = new ArrayList<Phone>();
		
		Student student = new Student("Eswar");
		Phone phone1 = new Phone("house", "0686062352");
		Phone phone2 = new Phone("mobile", "987654321");
		
		phoneNumbers.add(phone1);
		phoneNumbers.add(phone2);
		
		student.setStudentPhoneNumbers(phoneNumbers);
		
		// 4 : Persistance Objet/Relationnel : cr�ation d'un enregistrement en base
		
		em.persist(student);
		em.persist(phone1);
		em.persist(phone2);
		
		// 5 : Fermeture transaction
		tx.commit();
		// 6 : Fermeture unit� de travail JPA
		
		em.close();
		
		em = emf.createEntityManager();
		
		tx = em.getTransaction();
		
		tx.begin();
		student = em.find(Student.class, 1L);
		student.getStudentPhoneNumbers().size();
		tx.commit();
		
		em.close();
		
		System.out.println(student.getStudentName());
		
		for (Phone p : student.getStudentPhoneNumbers()) {
			System.out.println("Num de telephone " + p.getPhoneNumber());
		}
		
		emf.close();
		
		System.out.println("ok.....!");
	}
}
