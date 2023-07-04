package jp.co.axa.apidemo.services;

import jp.co.axa.apidemo.entities.Employee;

import java.util.List;

public interface EmployeeService {
	/**
	 * 
	 *@param  employeeId
	 *@return Employee
	 */
    public List<Employee> retrieveEmployees();
    /**
	 *@param employeeId
	 *@return Employee
	 *
	 */
    public Employee getEmployee(Long employeeId);
    /**
	 *@param employee
	 *@return 
	 */
    public void saveEmployee(Employee employee);
    /**
	 * 
	 *@param employeeId
	 *@return 
	 */
    public void deleteEmployee(Long employeeId);
    /**
	 * 
	 *@param employee
	 *@return 
	 */
    public void updateEmployee(Employee employee);
}