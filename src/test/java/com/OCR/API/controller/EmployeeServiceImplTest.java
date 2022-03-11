package com.OCR.API.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

//import com.OCR.API.service.impl.EmployeeServiceImpl;

//import com.OCR.API.service.impl.EmployeeServiceImpl;
/*
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
*/

@ExtendWith(SpringExtension.class)			//JUnit5
@WebMvcTest(EmployeeController.class)	//EmployeeServiceImpl.class
public class EmployeeServiceImplTest {

	@Autowired
	public MockMvc mockMvc;

	@Test
	public void testGetEmployees() throws Exception {

		//this.mockMvc.perform(get("/employees")).andExpect(status().isOk()).andExpect(jsonPath("$[0].firstName", is("Agathe")));

	}

}