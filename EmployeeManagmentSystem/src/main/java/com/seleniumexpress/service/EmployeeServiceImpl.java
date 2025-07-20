package com.seleniumexpress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seleniumexpress.Entity.Employee;
import com.seleniumexpress.Repository.EmployeeRepository;
import com.seleniumexpress.exception.EmployeeNotFoundException;
import org.modelmapper.ModelMapper;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
	@Override
	public Employee findById(Integer employeeId) {
		return employeeRepository.findById(employeeId)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee with given Id is not found"));
	}
	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);

	}
	@Override
	public Employee updateEmployee(Integer employeeId, Employee employee) {
		Employee employee2 = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee with given Id is not found"));

		System.out.println(employee);
		modelMapper.map(employee, employee2);
		System.out.println(employee2);
		employee2.setEmployeeId(employeeId);
		return employeeRepository.save(employee);
	}
	@Override
	public void deleteEmployeeById(Integer employeeId) {
		Employee employee2 = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee with given Id is not found"));

		employeeRepository.delete(employee2);
	}

}
