package com.insurance.customer.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.customer.model.Customer;
import com.insurance.customer.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired CustomerRepository customerRepository;
	
	//Create Customer	
	public Customer create (String custId,String firstName, String lastName, String gender, String emailAddr, String phoneNo, long income, String occupation, Date dob, String billingAddr )
	{
	return customerRepository.save(new Customer(custId,firstName, lastName, gender, emailAddr, phoneNo, income, occupation, dob, billingAddr));
			
	 }
	
	//RetrieveCustomer
	public List<Customer> getAllCustomer(){
		
		return customerRepository.findAll();
	}
	
	//Retrieve Customer By customer id
	public Customer getByCustId(String custId) {
		return customerRepository.findByCustId(custId);
	}
	
	//Update Customer
	public Customer updateCustomer(String custId,String firstName, String lastName, String gender, String emailAddr, String phoneNo, long income, String occupation, Date dob, String billingAddr) {
		Customer cust= customerRepository.findByCustId(custId);
		cust.setFirstName(firstName);
		cust.setLastName(lastName);
		cust.setGender(gender);
		cust.setEmailAddr(emailAddr);
		cust.setPhoneNo(phoneNo);
		cust.setIncome(income);
		cust.setOccupation(occupation);
		cust.setDob(dob);
		cust.setBillingAddr(billingAddr);
		return customerRepository.save(cust);		
	}
	
	//Delete Customer
	public void deleteCustomer(String custId) {
		Customer cust= customerRepository.findByCustId(custId);
		customerRepository.delete(cust);
	}
}