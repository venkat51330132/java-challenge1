package jp.co.axa.apidemo.services;

import jp.co.axa.apidemo.entities.Employee;
import jp.co.axa.apidemo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    /**
	 *@param 
	 *@return List<Employee>
	 */
    public List<Employee> retrieveEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }
    /**
	 *@param employeeId
	 *@return employeeId
	 */
    public Employee getEmployee(Long employeeId) {
        Optional<Employee> optEmp = employeeRepository.findById(employeeId);
        return optEmp.get();
    }
    /**
	 *@param employee
	 *@return void
	 */
    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }
    /**
	 *@param employeeId
	 *@return void
	 */
    public void deleteEmployee(Long employeeId){
        employeeRepository.deleteById(employeeId);
    }
    /**
	 *@param employee
	 *@return void
	 */
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}