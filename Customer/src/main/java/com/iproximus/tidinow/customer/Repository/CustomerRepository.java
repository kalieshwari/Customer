package com.iproximus.tidinow.customer.Repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.iproximus.tidinow.customer.Model.Customer;

public interface CustomerRepository extends CrudRepository<Customer,String> {

	Customer findByQualification (String qualification);
	
}
