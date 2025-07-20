package com.seleniumexpress.service;

import java.util.List;

import com.seleniumexpress.Entity.Employee;

public interface EmployeeService {

	void deleteEmployeeById(Integer employeeId);

	Employee updateEmployee(Integer employeeId, Employee employee);

	Employee saveEmployee(Employee employee);

	Employee findById(Integer employeeId);

	List<Employee> findAll();

}
