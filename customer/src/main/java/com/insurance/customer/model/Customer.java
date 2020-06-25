package com.insurance.customer.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Document(collection="customer")
public class Customer {

	@Id
	private String custId;
	private String firstName;
	private String lastName;
	private String gender;
	private String emailAddr;
	private String phoneNo;
	private long income;
	private String occupation;
	@DateTimeFormat(iso = ISO.DATE)
	private Date dob;
	private String billingAddr;
	
	public Customer(String custId, String firstName, String lastName, String gender, String emailAddr, String phoneNo, long income, String occupation, Date dob, String billingAddr ) {
		super();
		this.custId=custId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
		this.emailAddr=emailAddr;
		this.phoneNo=phoneNo;
		this.income=income;
		this.occupation=occupation;
		this.dob=dob;
		this.billingAddr=billingAddr;
	}
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public long getIncome() {
		return income;
	}
	public void setIncome(long income) {
		this.income = income;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getBillingAddr() {
		return billingAddr;
	}
	public void setBillingAddr(String billingAddr) {
		this.billingAddr = billingAddr;
	}	
	public String toString() {
		
		return"CustId: "+custId+" "
				+ "FirstName: "+firstName+" LastName: "+lastName;
	}
}
