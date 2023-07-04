package jp.co.axa.apidemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import jp.co.axa.apidemo.entities.Employee;
import jp.co.axa.apidemo.services.EmployeeService;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Venkata Challa
 * 
 * This is Spring boot application class
 *
 */
//@sl4j
@EnableSwagger2
@SpringBootApplication
public class ApiDemoApplication implements CommandLineRunner{
	
	@Autowired
    private EmployeeService employeeService;
	/**
	 * 
	 * This method will run the spring application
	 * @param args
	 *          the application to run
	 */

	public static void main(String[] args) {
		SpringApplication.run(ApiDemoApplication.class, args);
	}

	@Override
	//just for checking purpose,it means dummy objects/static data execution /only one time data
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setName("Venkat");
		employee.setSalary(1000);
		employee.setDepartment("IT");
		employee.setId((long) 101);
		employeeService.saveEmployee(employee); 
		
		
		
		
		
	}

}
