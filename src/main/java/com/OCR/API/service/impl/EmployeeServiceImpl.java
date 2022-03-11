package com.OCR.API.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OCR.API.model.Employee;
import com.OCR.API.repository.EmployeeRepository;

import lombok.Data;

@Data
@Service
public class EmployeeServiceImpl   {	//implements EmployeeService

	
	@Autowired
	private EmployeeRepository employeeRepository;

	//@Override
	public Optional<Employee> getEmployee(final Long id) {
		return employeeRepository.findById(id);
	}	
	
	//@Override
	public Iterable<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	//@Override
	public void deleteEmployee(final Long id) {
		employeeRepository.deleteById(id);
	}

	//@Override
	public Employee saveEmployee(Employee employee) {	
		Employee savedEmployee = employeeRepository.save(employee);
		return savedEmployee;
	}
	
}
