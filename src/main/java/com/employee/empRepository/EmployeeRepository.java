package com.employee.empRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.empEntity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}