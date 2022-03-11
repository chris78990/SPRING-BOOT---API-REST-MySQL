package com.OCR.API.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.OCR.API.model.Employee;
import com.OCR.API.service.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/")			//Line added in order to use the 3 RestController in the same project.
public class EmployeeController {

	@Autowired
    private EmployeeServiceImpl employeeServiceImpl;
        
    /*
     * Add a new employee
     * POST - http://localhost:9000/employee
     * Body JSON with 4 parameters: firstName, lastName, mail, password
     */
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeServiceImpl.saveEmployee(employee);
	}

	/*
	 * Read an employee if he exists
	 * GET - http://localhost:9000/employee/1
	 */
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") final Long id) {
		Optional<Employee> employee = employeeServiceImpl.getEmployee(id);
		if(employee.isPresent()) {
			return employee.get();
		} else {
			return null;
		}
	}
	
	/*
	 * Read all employees
	 * GET - http://localhost:9000/employees
	 */
	@GetMapping("/employees")
	public Iterable<Employee> getEmployees() {
		return employeeServiceImpl.getEmployees();
	}
    
	/*
	 * Delete an employee
	 * DELETE - http://localhost:9000/employee/5
	 */
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable("id") final Long id) {
		employeeServiceImpl.deleteEmployee(id);
	}
	
	/*
	 * Update an employee
	 * PUT - http://localhost:9000/employee/1
	 * Body JSON with 4 parameters: firstName, lastName, mail, password
	 */
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@PathVariable("id") final Long id, @RequestBody Employee employee) {
		Optional<Employee> e = employeeServiceImpl.getEmployee(id);
		if(e.isPresent()) {
			Employee currentEmployee = e.get();
			
			String firstName = employee.getFirstName();
			if(firstName != null) {
				currentEmployee.setFirstName(firstName);
			}
			String lastName = employee.getLastName();
			if(lastName != null) {
				currentEmployee.setLastName(lastName);
			}
			String mail = employee.getMail();
			if(mail != null) {
				currentEmployee.setMail(mail);
			}
			String password = employee.getPassword();
			if(password != null) {
				currentEmployee.setPassword(password);;
			}
			employeeServiceImpl.saveEmployee(currentEmployee);
			return currentEmployee;
		} else {
			return null;
		}
	}
	
	
}