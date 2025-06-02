package com.employee.empDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.empEntity.Employee;
import com.employee.empRepository.EmployeeRepository;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepository er;

	// create single employee
	public String postSingleObj(Employee e) {
		er.save(e);
		return "Post Single Obj Successfully";
	}

	// list of employee
	public String postObj(List<Employee> e) {
		er.saveAll(e);
		return "Post Obj Successfully";
	}

	// get single data
	public Employee getSingleObj(int n) {
		Employee x = er.findById(n).get();
		return x;
	}

	// get all data
	public List<Employee> getAllObj() {
		return er.findAll();
	}

	// delete by id
	public String delSingleData(int a) {
		er.deleteById(a);
		return "Deleted single data successfully";
	}

	// update by id
	public String updateSingleData(Employee e, int b) {
		Employee a = er.findById(b).get();
		a.setName(e.getName());
		a.setSalary(e.getSalary());
		a.setExperience(e.getExperience());
		a.setGender(e.getGender());
		a.setRole(e.getRole());
		er.save(a);
		return "Updated Successfully";
	}
  
	// single field update by id
	public String updateSingleField(Employee e, int b) {
		Employee a = er.findById(b).get();
		a.setName(e.getName());
		er.save(a);
		return "Updated Single Field Successfully";
	}

}