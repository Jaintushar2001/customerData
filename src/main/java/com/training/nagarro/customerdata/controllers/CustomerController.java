package com.training.nagarro.customerdata.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.training.nagarro.customerdata.entities.Customer;
import com.training.nagarro.customerdata.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	 @GetMapping("/getCustomers")
	 public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@PostMapping("/saveCustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
	    return customerService.saveCustomer(customer);
	}


}
