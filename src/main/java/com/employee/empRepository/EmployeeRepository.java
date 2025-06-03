package com.employee.empRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.empEntity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("select e from Employee e")
	public List<Employee> getAll();

	@Query("select e.name from Employee e")
	public List<String> getOnlyName();

}