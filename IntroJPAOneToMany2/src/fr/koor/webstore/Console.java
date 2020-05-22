package fr.koor.webstore;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.formation.entities.Phone;
import com.formation.entities.Student;

import fr.koor.webstore.business.Command;
import fr.koor.webstore.business.User;

public class Console {

    public static void main(String[] args) throws Exception {
        EntityManagerFactory emf  = null;
        EntityManager em = null;
        
        try {
        
        	emf  = Persistence.createEntityManagerFactory("WebStore");
            em = emf.createEntityManager();
            
        EntityTransaction tx = em.getTransaction();
    		
   		 //creation des instances
   		tx.begin();
   		
   		List<Phone> phoneNumbers = new ArrayList<Phone>();
   		
   		Student student = new Student("ESWAR");
   		Phone phone1 = new Phone("house", "123456789");
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
   		
   		
   		System.out.println("OK   §");
        
//            User user = entityManager.find( User.class, 1 );            
//            for( Command cmd : user.getCommands() ) {
//                System.out.println( cmd );
//            }
            
        } finally {
            if ( em != null ) em.close();
            if ( emf != null ) emf.close();
        }
    }
}
