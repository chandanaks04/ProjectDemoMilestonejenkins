package com.chandu.MilestoneAssessment5.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chandu.MilestoneAssessment5.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
