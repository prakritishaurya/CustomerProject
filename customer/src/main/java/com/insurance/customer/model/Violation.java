package com.insurance.customer.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Document(collection="violation")
public class Violation {
	
	@Id
	private int violationId;
	private String firstName;
	private String lastName;
	@DateTimeFormat(iso = ISO.DATE)
	private Date dob;
	private String violation_type;
	private String isAtFault;
	private String violation_place;
	@DateTimeFormat(iso = ISO.DATE)
	private Date violation_date;
	private String degree_of_violation;
	private String case_registered;
	private long fine_charged;
	public int getViolationId() {
		return violationId;
	}
	public void setViolationId(int violationId) {
		this.violationId = violationId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getViolation_type() {
		return violation_type;
	}
	public void setViolation_type(String violation_type) {
		this.violation_type = violation_type;
	}
	public String getIsAtFault() {
		return isAtFault;
	}
	public void setIsAtFault(String isAtFault) {
		this.isAtFault = isAtFault;
	}
	public String getViolation_place() {
		return violation_place;
	}
	public void setViolation_place(String violation_place) {
		this.violation_place = violation_place;
	}
	public Date getViolation_date() {
		return violation_date;
	}
	public void setViolation_date(Date violation_date) {
		this.violation_date = violation_date;
	}
	public String getDegree_of_violation() {
		return degree_of_violation;
	}
	public void setDegree_of_violation(String degree_of_violation) {
		this.degree_of_violation = degree_of_violation;
	}
	public String getCase_registered() {
		return case_registered;
	}
	public void setCase_registered(String case_registered) {
		this.case_registered = case_registered;
	}
	public long getFine_charged() {
		return fine_charged;
	}
	public void setFine_charged(long fine_charged) {
		this.fine_charged = fine_charged;
	}
	
}
