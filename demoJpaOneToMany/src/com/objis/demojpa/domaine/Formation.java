package com.objis.demojpa.domaine;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; // Identifiant formation (Clé primaire)
	
	private String theme; // Thème formation
	
	@OneToMany(mappedBy="formation",cascade=CascadeType.PERSIST)
	Collection<Participant> listeParticipants = new ArrayList<Participant>();
	
	// Getters et Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	public Collection<Participant> getListeParticipants() {
		return listeParticipants;
	}
	public void setListeParticipants(Collection<Participant> listeParticipants) {
		this.listeParticipants = listeParticipants;
	}
	// Constructeur
	public Formation(String theme) {
		super();
		this.theme = theme;
	}	
	// Constructeur
	public Formation() {
		super();
	}	
}
