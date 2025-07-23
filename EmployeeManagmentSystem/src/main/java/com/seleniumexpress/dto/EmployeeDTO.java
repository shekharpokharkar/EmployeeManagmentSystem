package com.seleniumexpress.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class EmployeeDTO {

	@JsonProperty(value = "Emp_ID")
	private Integer employeeId;

	@JsonProperty(value = "Emp_Name")
	private String employeeName;

	@JsonProperty(value = "Emp_Department")
	private String employeeDepartment;

	@JsonProperty(value = "Emp_Marriatal_Status")
	private Boolean married;

	@JsonFormat(pattern = "dd-MM-yyyy")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@JsonProperty(value = "Emp_DOJ")
	private LocalDate joiningDate;

	@JsonProperty(value = "Emp_Salary")
	private Double employeeSalary;
}
