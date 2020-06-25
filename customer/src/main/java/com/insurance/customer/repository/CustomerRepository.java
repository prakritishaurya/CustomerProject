package com.insurance.customer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.insurance.customer.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>{
      public Customer findByCustId(String custId);
      
}
