package com.employee.empController;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
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

	static Logger log = Logger.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService es;

	// create single employee with log4j
	@PostMapping(value = "/postSingleObj")
	public String postSingleObj(@RequestBody Employee e) {
		BasicConfigurator.configure();
		log.info(es.postSingleObj(e));
		return es.postSingleObj(e);
	}

	// list of employee
	@PostMapping(value = "/postObj")
	public String postObj(@RequestBody List<Employee> e) {
		return es.postObj(e);
	}

	// get single data with log4j
	@GetMapping(value = "/getSingleObj/{n}")
	public Employee getSingleObj(@PathVariable int n) {
		PropertyConfigurator.configure("log4jEmployee.Properties");
		log.info(es.getAllObj());
		return es.getSingleObj(n);
	}

	// get all data with log4j
	@GetMapping(value = "/getAllObj")
	public List<Employee> getAllObj() {
		BasicConfigurator.configure();
		log.info(es.getAllObj());
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

	// get only name
	@GetMapping("/getOnlyName")
	public List<String> getOnlyName() {
		return es.getOnlyName();
	}

}