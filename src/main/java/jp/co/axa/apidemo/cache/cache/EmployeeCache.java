package jp.co.axa.apidemo.cache.cache;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;


import jp.co.axa.apidemo.entities.Employee;
import jp.co.axa.apidemo.repositories.EmployeeRepository;


/**
 * 
 */

/**
 * @author venkat
 *
 */
public class EmployeeCache {
	
	 @Autowired
	 EmployeeRepository mployeeRepository;
	 
	 @Cacheable(value = "employe Cache", key = "#employeeId")
	    public Optional<Employee> getEmployee(Long employeeId) {
	        System.out.println("Retrieving from Database for name: " + employeeId);
	        return mployeeRepository.findById(employeeId);
	 }

}
