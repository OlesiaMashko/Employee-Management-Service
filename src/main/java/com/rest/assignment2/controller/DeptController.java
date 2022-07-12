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
@RequestMapping("/deptRest")
public class DeptController {
	@Autowired
	EmpService employeeService;
	
	@GetMapping("/dept")
	public List getAllDepartment() {
		return employeeService.getAllDepartment();
	}
}
