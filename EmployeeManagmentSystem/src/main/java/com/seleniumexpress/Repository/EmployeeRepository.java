package com.seleniumexpress.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seleniumexpress.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
