package com.OCR.API.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.OCR.API.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long > {

}
