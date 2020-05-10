package com.formation.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Student implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long studentId;
	private String studentName;

	@OneToMany
	@JoinTable(name = "STUD_PHONE", joinColumns = @JoinColumn(name = "STUD_ID"), inverseJoinColumns = @JoinColumn(name = "PHONE_ID"))

	private List<Phone> studentPhoneNumbers;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, List<Phone> studentPhoneNumbers) {
		super();
		this.studentName = studentName;
		this.studentPhoneNumbers = studentPhoneNumbers;
	}

	public Student(long studentId, String studentName, List<Phone> studentPhoneNumbers) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhoneNumbers = studentPhoneNumbers;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Phone> getStudentPhoneNumbers() {
		return studentPhoneNumbers;
	}

	public void setStudentPhoneNumbers(List<Phone> studentPhoneNumbers) {
		this.studentPhoneNumbers = studentPhoneNumbers;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhoneNumbers="
				+ studentPhoneNumbers + "]";
	}

}
