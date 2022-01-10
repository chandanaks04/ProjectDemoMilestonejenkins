package com.chandu.MilestoneAssessment5.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.MilestoneAssessment5.Repository.CustomerRepository;
import com.chandu.MilestoneAssessment5.Service.CustomerService;
import com.chandu.MilestoneAssessment5.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository obj;
	


	public CustomerServiceImpl(CustomerRepository obj) {
		super();
		this.obj = obj;
	}


	@Override
	public Customer saveCustomer(Customer c) {
		// TODO Auto-generated method stub
		return obj.save(c);
	}


	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return obj.findAll();
	}


	

}
