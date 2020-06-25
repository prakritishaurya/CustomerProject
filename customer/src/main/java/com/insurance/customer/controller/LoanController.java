package com.insurance.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.customer.model.Loan;
import com.insurance.customer.repository.LoanRepository;

@RestController
public class LoanController {

	@Autowired
	LoanRepository loanRepository;
	
	@RequestMapping("/createLoan")
	public String createLoanEntry(@RequestParam int loanId, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String dob, @RequestParam String loanAvailed, @RequestParam String loanType, @RequestParam long loanAmount, @RequestParam long loanEmi, @RequestParam String loanStartDate) {
		Loan l = loanRepository.save(new Loan(loanId, firstName, lastName, dob, loanAvailed, loanType, loanAmount, loanEmi, loanStartDate));
		return l.getFirstName()+l.getLastName();
	}
	
	@RequestMapping("/getLoan")
	public List<Loan> getLoan(@RequestParam String firstName,@RequestParam String lastName, @RequestParam String dob){
		
		return loanRepository.findByFirstNameAndLastNameAndDob(firstName,lastName,dob);
	}
}
