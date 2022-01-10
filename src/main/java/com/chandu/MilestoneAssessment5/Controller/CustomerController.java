package com.chandu.MilestoneAssessment5.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.MilestoneAssessment5.Service.CustomerService;
import com.chandu.MilestoneAssessment5.entity.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	private CustomerService obj;

	public CustomerController(CustomerService obj) {
		super();
		this.obj = obj;
	}
	
	@PostMapping("/save")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer c)
	{
		return new ResponseEntity<Customer>(obj.saveCustomer(c),HttpStatus.CREATED);
	}
	@GetMapping("/get")
	public List<Customer> getAllStudent()
	{
		return obj.getAllCustomer();
	}

}
