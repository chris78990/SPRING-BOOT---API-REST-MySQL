package com.OCR.API.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.OCR.API.service.impl.EmployeeServiceImpl;


@WebMvcTest(EmployeeController.class)
public class EmployeeController1Test {

@Autowired
private MockMvc mockMvc;

@MockBean
 private EmployeeServiceImpl employeeServiceImpl;
    
	@Test
	public void testGetEmployees() throws Exception {
		this.mockMvc.perform(get("/employees")).andExpect(status().isOk());
	}	
}
