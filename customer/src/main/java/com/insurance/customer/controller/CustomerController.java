package com.insurance.customer.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.customer.model.Customer;
import com.insurance.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String custId,@RequestParam String firstName, @RequestParam String lastName, @RequestParam String gender, @RequestParam String emailAddr, @RequestParam String phoneNo, @RequestParam long income,
			@RequestParam String occupation, @RequestParam Date dob, @RequestParam String billingAddr) {
		Customer c= customerService.create(custId,firstName, lastName, gender, emailAddr, phoneNo, income, occupation, dob, billingAddr);
		return c.toString();
	}
	
	@RequestMapping("/getAll")
	public List<Customer> getAll(){
		
		return customerService.getAllCustomer();
	}
	
	@RequestMapping("/get")
	public Customer getByCustId(@RequestParam String custId) {
		Customer c = customerService.getByCustId(custId);
		return c;
	}
	
	@RequestMapping("/update")
	public String updateCustomer(@RequestParam String custId, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String gender, @RequestParam String emailAddr, @RequestParam String phoneNo, @RequestParam long income,
			@RequestParam String occupation, @RequestParam Date dob, @RequestParam String billingAddr ) {
		Customer c = customerService.updateCustomer(custId, firstName, lastName, gender, emailAddr, phoneNo, income, occupation, dob, billingAddr);
		return c.toString();
	}
	@RequestMapping("/delete")
	public void deleteCustomer(@RequestParam String custId) {
		customerService.deleteCustomer(custId);		
	}
}
