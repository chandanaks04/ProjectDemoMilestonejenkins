package com.chandu.MilestoneAssessment5.Service;

import java.util.List;



import com.chandu.MilestoneAssessment5.entity.Customer;

public interface CustomerService {
	public Customer saveCustomer(Customer c);
	public List<Customer> getAllCustomer();
}
