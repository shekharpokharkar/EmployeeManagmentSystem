package com.seleniumexpress.controller_Test;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.seleniumexpress.Entity.Employee;
import com.seleniumexpress.controller.EmployeeController;
import com.seleniumexpress.service.EmployeeService;

//@WebMvcTest(EmployeeController.class)
public class EmployeeController_Test {

	/*
	 * @Autowired private MockMvc mockMVC;
	 * 
	 * @MockBean private EmployeeService employeeService;
	 * 
	 * @Autowired private ObjectMapper mapper;
	 * 
	 * private Employee swapnil; private Employee shekhar;
	 * 
	 * @BeforeEach public void saveEmployee() { swapnil = new Employee();
	 * swapnil.setEmployeeDepartment("MECHANICAL");
	 * swapnil.setEmployeeName("SWAPNIL"); swapnil.setEmployeeSalary(4856.00);
	 * swapnil.setJoiningDate(LocalDate.of(2020, 10, 30));
	 * swapnil.setMarried(false);
	 * 
	 * shekhar = new Employee(); shekhar.setEmployeeDepartment("Computer");
	 * shekhar.setEmployeeName("SHEKHAR"); shekhar.setEmployeeSalary(9999.00);
	 * shekhar.setJoiningDate(LocalDate.of(2022, 05, 15)); shekhar.setMarried(true);
	 * }
	 * 
	 * @Test
	 * 
	 * @DisplayName("Test Save Employee Controller") public void saveEmployee_Test()
	 * throws JsonProcessingException, Exception {
	 * 
	 * when(employeeService.saveEmployee(any(Employee.class))).thenReturn(shekhar);
	 * 
	 * shekhar.setEmployeeId(101);
	 * 
	 * this.mockMVC
	 * .perform(post("/v1/employee/").contentType(MediaType.APPLICATION_JSON_VALUE)
	 * .content(mapper.writeValueAsString(shekhar)))
	 * .andExpect(status().isOk()).andExpect(jsonPath("$.employeeName",
	 * is(shekhar.getEmployeeName()))) .andExpect(jsonPath("$.employeeDepartment",
	 * is(shekhar.getEmployeeDepartment())));
	 * 
	 * }
	 * 
	 * @Test
	 * 
	 * @DisplayName("Update Employee Test") public void updateEmployeeTest() throws
	 * JsonProcessingException, Exception {
	 * when(employeeService.updateEmployee(any(Integer.class),
	 * any(Employee.class))).thenReturn(shekhar);
	 * 
	 * this.mockMVC .perform(put("/v1/employee/{id}",
	 * 101).contentType(MediaType.APPLICATION_JSON_VALUE)
	 * .content(mapper.writeValueAsString(shekhar)))
	 * .andExpect(status().isAccepted()).andExpect(jsonPath("$.employeeName",
	 * is(shekhar.getEmployeeName())));
	 * 
	 * }
	 */

}
