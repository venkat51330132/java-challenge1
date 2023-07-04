package jp.co.axa.apidemo.controllers;

import jp.co.axa.apidemo.entities.Employee;
import jp.co.axa.apidemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * @author
 * Controller for Employee Details API
 *
 */

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    /**
     * getEmployees - This method retrieves all employees details
     *@param 
     *@return Employee
     */
    
    //@GetMapping("/employees") http://localhost:/api/v1/all
	/*
	 * @ApiOperation(value="fetch employee details",response = Employee.class)
	 * 
	 * @ApiImplicitParams({ @ApiImplicitParam(name = "API-version"
	 * value="API version",paramType="header", required=true)
	 * 
	 * @ApiImplicitParam(name ="TenentID"),
	 * 
	 * @ApiImplicitParam(name ="Content-Type"),
	 * 
	 * @ApiImplicitParam(name ="X-RequestID"),
	 * 
	 * @ApiImplicitParam(name ="accept"),
	 * 
	 * @ApiImplicitParam(name ="Accept-Language"),
	 * 
	 * })
	 */
    @GetMapping("/all")
    public List<Employee> getEmployees() {
        List<Employee> employees = employeeService.retrieveEmployees();
        return employees;
    }
    
    /**
     *getEmployees - This method retrieves employee details specified employeeId
     *@param employeeId
     *@return Employee
     */
    @GetMapping("/{employeeId}")
    //http://localhost:/api/v1/200
    public Employee getEmployee(@PathVariable(name="employeeId")Long employeeId) {
        return employeeService.getEmployee(employeeId);
    }
    
    /**
     *getEmployees - This method save employee details
     *@param employeeId
     *@return void
     */
    //@PostMapping("/employees")
    @PostMapping("/create")
    public void saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        System.out.println("Employee Saved Successfully");
    }
    /**
     *getEmployees - This method delete the  employee details
     *@param employeeId
     *@return void
     */
    @DeleteMapping("/{employeeId}")
    public void deleteEmployee(@PathVariable(name="employeeId")Long employeeId){
        employeeService.deleteEmployee(employeeId);
        System.out.println("Employee Deleted Successfully");
    }
    /**
     * getEmployees - This method update the  employee details
     *@param employeeId
     *@return void
     */
    @PutMapping("/{employeeId}")
    public void updateEmployee(@PathVariable(name="employeeId")Long employeeId){
        Employee emp = employeeService.getEmployee(employeeId);
        if(emp != null){
            employeeService.updateEmployee(emp);
        }

    }

}
