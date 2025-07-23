package com.seleniumexpress.service;

import java.util.List;
import java.util.function.Function;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seleniumexpress.Entity.Employee;
import com.seleniumexpress.Repository.EmployeeRepository;
import com.seleniumexpress.dto.EmployeeDTO;
import com.seleniumexpress.exception.EmployeeNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeDTO> findAll() {
		return employeeRepository.findAll().stream().map(emp -> {
			EmployeeDTO dto = new EmployeeDTO();
			BeanUtils.copyProperties(emp, dto);
			return dto;

		}).toList();
	}

	@Override
	public EmployeeDTO findById(Integer employeeId) {
		return employeeRepository.findById(employeeId).map(emp -> {
			EmployeeDTO dto = new EmployeeDTO();
			BeanUtils.copyProperties(emp, dto);
			return dto;

		}).orElseThrow(() -> new EmployeeNotFoundException("Employee with given Id is not found"));
	}

	@Override
	public EmployeeDTO saveEmployee(EmployeeDTO employee) {

		Employee emp = new Employee();
		BeanUtils.copyProperties(employee, emp);
		EmployeeDTO dto = new EmployeeDTO();
		BeanUtils.copyProperties(employeeRepository.save(emp), dto);
		return dto;
	}

	@Override
	public EmployeeDTO updateEmployee(Integer employeeId, EmployeeDTO employee) {
		Employee employee2 = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee with given Id is not found"));

		BeanUtils.copyProperties(employee, employee2);

		employee2.setEmployeeId(employeeId);
		Employee save = employeeRepository.save(employee2);
		EmployeeDTO dto = new EmployeeDTO();
		BeanUtils.copyProperties(save, dto);
		return dto;
	}

	@Override
	public void deleteEmployeeById(Integer employeeId) {
		Employee employee2 = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee with given Id is not found"));

		employeeRepository.delete(employee2);
	}

}
