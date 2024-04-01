package com.training.nagarro.customerdata.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.nagarro.customerdata.entities.Customer;
import com.training.nagarro.customerdata.repository.CustomerRepo;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepo customerRepo;
    
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }
    
    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }
    
}
