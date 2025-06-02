package com.employee.empController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.empEntity.Employee;
import com.employee.empservice.EmployeeService;

@RestController
@RequestMapping(value = "/home")
public class EmployeeController {

	@Autowired
	EmployeeService es;

	// create single employee
	@PostMapping(value = "/postSingleObj")
	public String postSingleObj(@RequestBody Employee e) {
		return es.postSingleObj(e);
	}

	// list of employee
	@PostMapping(value = "/postObj")
	public String postObj(@RequestBody List<Employee> e) {
		return es.postObj(e);
	}

	// get single data
	@GetMapping(value = "/getSingleObj/{n}")
	public Employee getSingleObj(@PathVariable int n) {
		return es.getSingleObj(n);
	}

	// get all data
	@GetMapping(value = "/getAllObj")
	public List<Employee> getAllObj() {
		return es.getAllObj();
	}

	// delete by id
	@DeleteMapping(value = "/delSingleData/{a}")
	public String delSingleData(@PathVariable int a) {
		return es.delSingleData(a);
	}

	// update by id
	@PutMapping(value = "/updateSingleData/{b}")
	public String updateSingleData(@RequestBody Employee e, @PathVariable int b) {
		return es.updateSingleData(e, b);
	}

	// single field update by id
	@PatchMapping(value = "/updateSingleField/{b}")
	public String updateSingleField(@RequestBody Employee e, @PathVariable int b) {
		return es.updateSingleField(e, b);
	}
	
	// get all using jpqlQuery
	@GetMapping("/getAll")
	public List<Employee> getAll() {
		return es.getAll();
	}

}