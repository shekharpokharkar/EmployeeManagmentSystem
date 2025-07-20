package com.seleniumexpress.IntegretedTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import com.seleniumexpress.Entity.Employee;
import com.seleniumexpress.Repository.EmployeeRepository;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeIntegratedTest {

	@LocalServerPort
	private int port;

	private String path = "http://localhost:";

	private static RestTemplate restTemplate;

	@Autowired
	private EmployeeRepository repository;

	@BeforeAll
	public static void initialize() {
		restTemplate = new RestTemplate();
	}

	@BeforeEach
	public void setUpUrl() {
		path = path + port + "/v1/employee";
	}

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
	@DisplayName("/test save employee")
	public void createEmployee_Test() {
		Employee postForObject = restTemplate.postForObject(path + "/", shekhar, Employee.class);

		assertNotNull(postForObject);
	}

	@Test
	@DisplayName("/test delete employee")
	public void deleteEmployee_Test() {

		Employee postForObject = restTemplate.postForObject(path + "/", shekhar, Employee.class);

		restTemplate.delete(path + "/{id}", postForObject.getEmployeeId());

	}

	@Test
	@DisplayName("/test findAll employee")
	public void findAllEmployee_Test() {

		Employee postForObject1 = restTemplate.postForObject(path + "/", shekhar, Employee.class);

		Employee postForObject2 = restTemplate.postForObject(path + "/", swapnil, Employee.class);

		Employee[] forObject = restTemplate.getForObject(path + "/", Employee[].class);

		assertNotNull(forObject);
	}

	@Test
	@DisplayName("/test findById employee")
	public void findByIdEmployee_Test() {

		Employee postForObject1 = restTemplate.postForObject(path + "/", shekhar, Employee.class);

		Employee forObject = restTemplate.getForObject(path + "/{id}", Employee.class, postForObject1.getEmployeeId());

		assertNotNull(forObject);
	}

}
