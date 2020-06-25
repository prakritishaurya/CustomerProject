package com.insurance.customer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="loan")
public class Loan {

	@Id
	private int loanId;
	private String firstName;
	private String lastName;
	private String dob;
	private String loanAvailed;
	private String loanType;
	private long loanAmount;
	private long loanEmi;
	private String loanDate;
	
	public Loan(int loanId, String firstName, String lastName, String dob, String loanAvailed, String loanType,
			long loanAmount, long loanEmi, String loanDate) {
		super();
		this.loanId = loanId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.loanAvailed = loanAvailed;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.loanEmi = loanEmi;
		this.loanDate = loanDate;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getLoanAvailed() {
		return loanAvailed;
	}
	public void setLoanAvailed(String loanAvailed) {
		this.loanAvailed = loanAvailed;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public long getLoanEmi() {
		return loanEmi;
	}
	public void setLoanEmi(long loanEmi) {
		this.loanEmi = loanEmi;
	}
	public String getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}	
}
