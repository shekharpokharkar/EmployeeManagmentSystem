package com.seleniumexpress.Entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Employee_Test")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Employee_Id")
	private Integer employeeId;
	@Column(name = "Employee_Name")
	private String employeeName;
	@Column(name = "Employee_Departmet")
	private String employeeDepartment;
	@Column(name = "Employee_Married")
	private Boolean married;
	@JsonFormat(pattern = "dd-MM-yyyy")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "Employee_Joining_Date")
	private LocalDate joiningDate;
	@Column(name = "Employee_Salary")
	private Double employeeSalary;

}
