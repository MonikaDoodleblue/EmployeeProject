package com.employee.empservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.empDao.EmployeeDao;
import com.employee.empEntity.Employee;
import com.employee.empRepository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao ed;

	@Autowired
	EmployeeRepository er;

	// create single employee
	public String postSingleObj(Employee e) {
		return ed.postSingleObj(e);
	}

	// list of employee
	public String postObj(List<Employee> e) {
		return ed.postObj(e);
	}

	// get single data
	public Employee getSingleObj(int n) {
		return ed.getSingleObj(n);
	}

	// get all data
	public List<Employee> getAllObj() {
		return ed.getAllObj();
	}

	// delete by id
	public String delSingleData(int a) {
		return ed.delSingleData(a);
	}

	// update by id
	public String updateSingleData(Employee e, int b) {
		return ed.updateSingleData(e, b);
	}

	// single field update by id
	public String updateSingleField(Employee e, int b) {
		return ed.updateSingleField(e, b);
	}

	// get all using jpqlQuery
	public List<Employee> getAll() {
		return er.getAll();
	}

	// get only name
	public List<String> getOnlyName() {
		return er.getOnlyName();
	}

}