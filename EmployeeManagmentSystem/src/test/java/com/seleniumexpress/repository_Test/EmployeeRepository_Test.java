package com.seleniumexpress.repository_Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.seleniumexpress.Entity.Employee;
import com.seleniumexpress.Repository.EmployeeRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EmployeeRepository_Test {

	@Autowired
	private EmployeeRepository employeeRepository;

	private Employee swapnil;
	private Employee shekhar;

	@BeforeEach
	public void saveEmployee() {
		swapnil = new Employee();
		swapnil.setEmployeeDepartment("MECHANICAL");
		swapnil.setEmployeeName("SWAPNIL");
		swapnil.setEmployeeSalary(4856.00);
		swapnil.setJoiningDate(LocalDate.of(2020, 10, 30));
		swapnil.setMarried(false);

		shekhar = new Employee();
		shekhar.setEmployeeDepartment("Computer");
		shekhar.setEmployeeName("SHEKHAR");
		shekhar.setEmployeeSalary(9999.00);
		shekhar.setJoiningDate(LocalDate.of(2022, 05, 15));
		shekhar.setMarried(true);
	}

	@Test
	@DisplayName("Save Employee Test")
	public void findByIdEmployee_Test() {

		Employee save = employeeRepository.save(shekhar);
		assertNotNull(save);
		assertEquals("Computer", save.getEmployeeDepartment(), "Wrong method");
	}

	@Test
	@DisplayName("Find All Employee Test")
	public void findAllEmployee_Test() {
		employeeRepository.save(shekhar);
		employeeRepository.save(swapnil);
		List<Employee> save = employeeRepository.findAll();
		assertNotNull(save);
		assertEquals(2, save.size(), "Wrong method");
	}

	@Test
	@DisplayName("findByID Employee Test")
	public void findByIDEmployee_Test11() {

		Employee save = employeeRepository.save(shekhar);

		Optional<Employee> byId = employeeRepository.findById(save.getEmployeeId());

		assertNotNull(byId.get());

	}

	@Test
	@DisplayName("delete By Id Employee Test")
	public void deleteEmployee_Test() {

		Employee save = employeeRepository.save(shekhar);

		employeeRepository.delete(save);

		Optional<Employee> result = employeeRepository.findById(save.getEmployeeId());

		assertFalse(result.isPresent(), "Employee should be deleted");
	}

	@Test
	@DisplayName("upadte Employee Test")
	public void updateEmployee_Test1() {

		Employee save1 = employeeRepository.save(shekhar);
		save1.setEmployeeName(save1.getEmployeeName() + "-updated");
		Employee save2 = employeeRepository.save(save1);
		assertNotNull(save2);
		assertEquals("SHEKHAR-updated" + "" + "" + "", save2.getEmployeeName(), "Wrong method");
	}

}
