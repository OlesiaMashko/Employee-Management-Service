package com.rest.assignment2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.assignment2.model.BaseResponse;
import com.rest.assignment2.model.Employee;
import com.rest.assignment2.model.Department;
import com.rest.assignment2.model.StatusType;
import com.rest.assignment2.service.EmpService;

//specifies that EmployeeController controller used in Restful Web services
@RestController
//maps HTTP requests to handler methods and provides the common route for all methods in EmployeeController
@RequestMapping("/empRest")
public class EmployeeController {
	
	//automatically assigns these properties with the passed values
	@Autowired
	EmpService employeeService;
	
	@GetMapping("/employees")
	public List getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	
	
	@GetMapping("/getEmployeeById/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}
	
	@PostMapping("/addEmployee")
	//@RequestMapping(value= "/addEmployee", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public BaseResponse addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@PostMapping("/addDepartment")
	//@RequestMapping(value= "/addEmployee", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public BaseResponse addDepartment(@RequestBody Department department) {
		return employeeService.addDepartment(department);
	}
	
	@PutMapping("/updateEmployee/{id}")
	public BaseResponse updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		return employeeService.updateEmployee(id,employee);
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public BaseResponse deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployee(id);
	}
	
}
