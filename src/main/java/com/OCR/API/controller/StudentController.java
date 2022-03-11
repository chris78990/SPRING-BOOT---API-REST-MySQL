package com.OCR.API.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.OCR.API.model.Student;


@RestController
public class StudentController {

	//GET HTTP Method
	//http://localhost:9000/hello-world
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	//GET HTTP Method
	//http://localhost:9000/Student
	@GetMapping("/Student")
	public Student getStudent() {
		return new Student("Christophe", "Bouvry");
	}

	//GET HTTP Method
	//http://localhost:9000/Students
	@GetMapping("/Students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ramesh", "Fadatare"));
		students.add(new Student("Christophe", "Bouvry"));
		return students;
	}
	
	//GET HTTP Method
	//http://localhost:9000/Student/bouvry/christophe
	//http://localhost:9000/Student/Fadatare/ramesh
	@GetMapping("/Student/{lastName}/{firstName}")			
	public Student getStudent_Path(@PathVariable String firstName, @PathVariable String lastName) {
		return new Student(firstName, lastName);
	}
	
	//GET HTTP Method with query parameters
	//http://localhost:9000/Student/Qry?firstName=Christophe&lastName=Bouvry
	@GetMapping("/Student/Qry")
	public Student getStudent_Query(
			@RequestParam(name="firstName") String firstName, 
			@RequestParam(name="lastName") String lastName) {
		return new Student(firstName, lastName);
	}	
	
	
	//GET HTTP Method
	//http://localhost:9000/Student/3
	
	
}
