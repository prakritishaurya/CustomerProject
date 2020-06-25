package com.insurance.customer.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.customer.model.Violation;
import com.insurance.customer.repository.ViolationRepository;

@RestController
public class ViolationController {

	@Autowired
	ViolationRepository violationRepository;
	
	@RequestMapping("/getViolationId")
	public List<Violation> getCustomerViolationId(@RequestParam String firstName, @RequestParam String lastName, @RequestParam Date dob) {
		Violation v = new Violation();
		v.setDob(dob);
		System.out.println(v.getDob());
		List<Violation> vList=violationRepository.findByFirstNameAndLastNameAndDob(firstName, lastName,dob);
		return vList;
	}
	
	@RequestMapping("/getByDate")
	public List<Violation> getViolationIds(@RequestParam Date dob){
		return violationRepository.findByDob(dob);
	}
}
