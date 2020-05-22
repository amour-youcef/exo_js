package com.objis.demojpa;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.objis.demojpa.domaine.Formation;
import com.objis.demojpa.domaine.Participant;

public class DemoJpa {

	public static void main(String[] args) {
		
		// 1 : Ouverture unité de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		
		// 2 : Ouverture transaction 
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		
		// 3 : Instanciation Objet métier
		Formation formation = new Formation("Hibernate");
		Participant participant1 = new Participant("Dupond", "Michel", "michel.dupond@objis.com", "1 av. Victor Hugo 59001 Lille");
		Participant participant2 = new Participant("Durant", "Pierre", "pierre.durant@objis.com", "2 rue Clos fleuri 69003 Lyon");
		
		Collection<Participant> participants = new ArrayList<Participant>();
		
		participant1.setFormation(formation);
		participant2.setFormation(formation);
		
		participants.add(participant1);
		participants.add(participant2);

		formation.setListeParticipants(participants);
		
		// 4 : Persistance Objet/Relationnel : création d'un enregistrement en base
		// em.persist(participant1);
		// em.persist(participant2);
		 em.persist(formation);
		
		// 5 : Fermeture transaction 
		 tx.commit();
		
		// 6 : Fermeture unité de travail JPA 
		em.close();
		emf.close();	
	}
}
