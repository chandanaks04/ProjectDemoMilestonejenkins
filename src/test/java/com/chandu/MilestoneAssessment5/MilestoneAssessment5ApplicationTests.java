package com.chandu.MilestoneAssessment5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.chandu.MilestoneAssessment5.Repository.CustomerRepository;
import com.chandu.MilestoneAssessment5.ServiceImpl.CustomerServiceImpl;
import com.chandu.MilestoneAssessment5.entity.Customer;

@SpringBootTest
class MilestoneAssessment5ApplicationTests {

	@Autowired 
	private CustomerServiceImpl custserv; 
	
	@MockBean 
	private CustomerRepository custrepo; 
	
	@Test
	public void getAllCustomerTest() {
		when(custrepo.findAll()).thenReturn(Stream
				.of(new Customer(1, "Chandana K S", "Female", 21, "veg"), new Customer(2, "Nishanth", "male", 23, "nonveg")).collect(Collectors.toList()));
	 assertEquals(2, custserv.getAllCustomer().size()); 
	
	}
	
	@Test
	public void addCustomerTest() {
		Customer c1=new Customer(1, "Chandana K S", "Female", 21, "veg"); 
		when(custrepo.save(c1)).thenReturn(c1); 
		assertEquals(c1, custserv.saveCustomer(c1));
	}
}
