package com.formation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student implements java.io.Serializable{
	
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private long studentId;
    private String studentName;
    
    @OneToOne
    @JoinColumn(name="ADR_ID")
    private Address studentAddress;
    
	
}
