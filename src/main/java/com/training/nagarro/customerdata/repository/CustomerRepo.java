package com.training.nagarro.customerdata.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.training.nagarro.customerdata.entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{

	List<Customer> findAll();

	Customer save(Customer customer);
	
	

}
