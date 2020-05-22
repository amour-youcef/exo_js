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

	public static void main(String[] args) {
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BasePU");
        EntityManager em         = emf.createEntityManager();
        EntityTransaction tx     =em.getTransaction();
        
        //Creation des instance 
        
        tx.begin();
        
        List<Phone> phoneNumbers = new ArrayList<Phone>();
        
        Student student = new Student ("Eswar");
        Phone phone1 = new Phone("house","32354353");
        Phone phone2 = new Phone("mobile","9889343423");
        
        phoneNumbers.add(phone1);
        phoneNumbers.add(phone2);
        
        student.setStudentPhoneNumbers(phoneNumbers);
        
        //intéraction avec jpa-hibernate
        
        em.persist(student);
        em.persist(phone1);
        em.persist(phone2);
        
        tx.commit();
        
        em.close();
        
        em = emf.createEntityManager();
        tx = em.getTransaction();
        
        tx.begin();
        student = em.find(Student.class, 1L);
        tx.commit();
        em.close();
        
        System.out.println(student.getStudentName());
        
        for (Phone p : student.getStudentPhoneNumbers()) {
		System.out.println("Num de telephone " + p.getPhoneNumber());	
		}
        	
        
        emf.close();
        
        System.out.println("OK ....");
        
	
	}

}
