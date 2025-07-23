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
import com.seleniumexpress.dto.EmployeeDTO;
import com.seleniumexpress.service.EmployeeService;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/")
	public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employee) {
		EmployeeDTO saveEmployee = employeeService.saveEmployee(employee);
		return new ResponseEntity<EmployeeDTO>(saveEmployee, HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<List<EmployeeDTO>> getAllEmployee() {
		List<EmployeeDTO> saveEmployee = employeeService.findAll();
		return new ResponseEntity<List<EmployeeDTO>>(saveEmployee, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable("id") Integer employeeId,
			@RequestBody EmployeeDTO employee) {
		EmployeeDTO updatedEmployee = employeeService.updateEmployee(employeeId, employee);
		return new ResponseEntity<EmployeeDTO>(updatedEmployee, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEmployeeById(@PathVariable("id") Integer employeeId) {
		employeeService.deleteEmployeeById(employeeId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/{id}")
	public ResponseEntity<EmployeeDTO> findEmployeeById(@PathVariable("id") Integer employeeId) {
		EmployeeDTO employee = employeeService.findById(employeeId);
		return new ResponseEntity<EmployeeDTO>(employee, HttpStatus.OK);
	}

}
