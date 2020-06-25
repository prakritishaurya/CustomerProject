package com.insurance.customer.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.insurance.customer.model.Loan;

@Repository
public interface LoanRepository extends MongoRepository<Loan, Integer>{

	public List<Loan> findByFirstNameAndLastNameAndDob(String firstName, String lastName,String dob);
}
