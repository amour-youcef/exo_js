package com.formation.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Phone implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long phoneId;
	private String phoneType;
	private String phoneNumber;

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(String phoneType, String phoneNumber) {
		super();
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}

	public Phone(long phoneId, String phoneType, String phoneNumber) {
		super();
		this.phoneId = phoneId;
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneType=" + phoneType + ", phoneNumber=" + phoneNumber + "]";
	}

	public long getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
