package com.OCR.API.service;

import java.util.Optional;

import com.OCR.API.model.Employee;

public interface EmployeeService {
	
	Optional<Employee> getEmployee(final Long id);
	
	Iterable<Employee> getEmployees();
	
	void deleteEmployee(final Long id);
	
	Employee saveEmployee(Employee employee);
	
	
}
