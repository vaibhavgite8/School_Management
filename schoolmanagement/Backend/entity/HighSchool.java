package com.example.PROJECT.entity;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@DynamicUpdate
public class HighSchool {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int schoolRegno;

	@Column(nullable = false, unique = true)
	String schoolName;

	@Column(nullable = false, unique = true)
	String schoolLocation;
	@Column
	int noOfStudents;
	@Column
	int noOfTeachers;
	@Column
	String schoolMailId;

	public String getSchoolMailId() {
		return schoolMailId;
	}

	public void setSchoolMailId(String schoolMailId) {
		this.schoolMailId = schoolMailId;
	}

	@Column(nullable = false)

	public int getSchoolRegno() {
		return schoolRegno;
	}

	public void setSchoolRegno(int schoolRegno) {
		this.schoolRegno = schoolRegno;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolLocation() {
		return schoolLocation;
	}

	public void setSchoolLocation(String schoolLocation) {
		this.schoolLocation = schoolLocation;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public int getNoOfTeachers() {
		return noOfTeachers;
	}

	public void setNoOfTeachers(int noOfTeachers) {
		this.noOfTeachers = noOfTeachers;
	}

	public HighSchool() {
		super();
	}

}
