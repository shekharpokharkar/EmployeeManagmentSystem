package com.seleniumexpress.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import com.seleniumexpress.Entity.Employee;
import com.seleniumexpress.Repository.EmployeeRepository;

//@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

	/*
	 * @InjectMocks private EmployeeServiceImpl employeeService;
	 * 
	 * @Mock private EmployeeRepository employeeRepository;
	 * 
	 * @Mock private ModelMapper mapper;
	 * 
	 * private Employee swapnil; private Employee shekhar;
	 * 
	 * @BeforeEach public void addEmployee() { swapnil = new Employee();
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
	 * @DisplayName("Save employee Test") public void saveEmployee_Test() {
	 * when(employeeRepository.save(any(Employee.class))).thenReturn(shekhar);
	 * shekhar.setEmployeeId(101);
	 * 
	 * Employee saveEmployee = employeeService.saveEmployee(shekhar);
	 * 
	 * assertNotNull(saveEmployee); }
	 * 
	 * @Test
	 * 
	 * @DisplayName("Find All Employee Test") public void findAllEmployee_Test() {
	 * shekhar.setEmployeeId(101); swapnil.setEmployeeId(501); List<Employee>
	 * empList = List.of(shekhar, swapnil);
	 * when(employeeRepository.findAll()).thenReturn(empList);
	 * 
	 * List<Employee> saveEmployee = employeeService.findAll();
	 * assertNotNull(saveEmployee); }
	 * 
	 * @Test
	 * 
	 * @DisplayName("update Employee Test") public void updateEmployee() {
	 * shekhar.setEmployeeId(101);
	 * when(employeeRepository.findById(any(Integer.class))).thenReturn(Optional.of(
	 * shekhar));
	 * 
	 * when(employeeRepository.save(any(Employee.class))).thenReturn(shekhar);
	 * 
	 * Employee updateEmployee = employeeService.updateEmployee(101, shekhar);
	 * assertNotNull(updateEmployee);
	 * 
	 * }
	 * 
	 * @Test
	 * 
	 * @DisplayName("Find Employee By Id Test") public void findEmployeeById_Test()
	 * { shekhar.setEmployeeId(101);
	 * 
	 * when(employeeRepository.findById(any(Integer.class))).thenReturn(Optional.of(
	 * shekhar));
	 * 
	 * Employee saveEmployee = employeeService.findById(101);
	 * assertNotNull(saveEmployee); }
	 * 
	 * @Test
	 * 
	 * @DisplayName("Find Employee By Id Test") public void
	 * findEmployeeByIdException_Test() { shekhar.setEmployeeId(101);
	 * 
	 * when(employeeRepository.findById(any(Integer.class))).thenReturn(Optional.of(
	 * shekhar));
	 * 
	 * Employee saveEmployee = employeeService.findById(101);
	 * assertNotNull(saveEmployee); }
	 * 
	 * @Test
	 * 
	 * @DisplayName("Delete Employee By Id Test") public void
	 * deleteEmployeeById_Test() { shekhar.setEmployeeId(101);
	 * 
	 * when(employeeRepository.findById(any(Integer.class))).thenReturn(Optional.of(
	 * shekhar)); doNothing().when(employeeRepository).delete(any(Employee.class));
	 * 
	 * employeeService.deleteEmployeeById(101); verify(employeeRepository,
	 * times(1)).delete(shekhar); }
	 */

}
