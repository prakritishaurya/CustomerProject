package com.insurance.customer.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.insurance.customer.model.Violation;

@Repository
public interface ViolationRepository extends MongoRepository<Violation, Integer>{
         
	public List<Violation> findByFirstNameAndLastNameAndDob(String firstName, String lastName, Date dob);
	
	public List<Violation> findByDob(Date dob);
	
}
