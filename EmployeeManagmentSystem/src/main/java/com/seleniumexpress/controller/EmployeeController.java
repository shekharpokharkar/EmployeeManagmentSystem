package com.seleniumexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seleniumexpress.Entity.Employee;
import com.seleniumexpress.service.EmployeeService;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee saveEmployee = employeeService.saveEmployee(employee);
		return new ResponseEntity<Employee>(saveEmployee, HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> saveEmployee = employeeService.findAll();
		return new ResponseEntity<List<Employee>>(saveEmployee, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Integer employeeId, @RequestBody Employee employee) {
		Employee updatedEmployee = employeeService.updateEmployee(employeeId, employee);
		return new ResponseEntity<Employee>(updatedEmployee, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEmployeeById(@PathVariable("id") Integer employeeId) {
		employeeService.deleteEmployeeById(employeeId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> findEmployeeById(@PathVariable("id") Integer employeeId) {
		Employee employee = employeeService.findById(employeeId);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

}
