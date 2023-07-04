package jp.co.axa.apidemo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * if use @Data from lambook ,can avoid all these setter and getter methods ,can make code clean
 * @Data
 * @AllArgsConstructors
 * @NoArgsConstructors
 * Builders
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="T_EMPLOYEE")//re name the table to T_EMPLOYEE
public class Employee implements Serializable{

	/*
	 * @Getter
	 * 
	 * @Setter
	 */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

	public Employee(String name, Integer salary, String department) {
		super();
		//this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public Employee() {
		
	}
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	/*
	 * @Getter
	 * 
	 * @Setter
	 */
    @Column(name="EMPLOYEE_NAME")//it is optional and rename to EMPLOYEE_NAME
    private String name;

	/*
	 * @Getter
	 * 
	 * @Setter
	 */
    @Column(name="EMPLOYEE_SALARY")
    private Integer salary;

	/*
	 * @Getter
	 * 
	 * @Setter
	 */
    @Column(name="DEPARTMENT")
    private String department;
  

}
