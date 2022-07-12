package com.rest.assignment2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.rest.assignment2.model.BaseResponse;
import com.rest.assignment2.model.Department;
import com.rest.assignment2.model.Employee;
import com.rest.assignment2.model.StatusType;
import com.rest.assignment2.repository.DeptRepository;
import com.rest.assignment2.repository.EmpRepository;
import java.sql.SQLIntegrityConstraintViolationException;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository empRepository;
	@Autowired
	private DeptRepository deptRepository;
	
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employees = (List<Employee>)empRepository.findAll();
		return employees;
	}
	
	public List<Department> getAllDepartment() {
		List<Department> departments = new ArrayList<Department>();
		departments = (List<Department>)deptRepository.findAll();
		return departments;
	}
	
	public Employee getEmployee(int id) {
		Optional<Employee> employee = empRepository.findById(id);
		return employee.orElseGet(null);
	}
	
	public BaseResponse addEmployee(Employee employee) {
		if (!empRepository.existsById(employee.getId())) {
			try {
				empRepository.save(employee);
				return new BaseResponse(StatusType.SUCCESS, "Added Successfully");
			} catch (Throwable e) {
				e.printStackTrace();
				if(e instanceof SQLIntegrityConstraintViolationException) {
					return new BaseResponse(StatusType.ERROR, "foreign key constraint violation");
			    }
				return new BaseResponse(StatusType.ERROR, "Failed");
			}
		} else {
			return new BaseResponse(StatusType.ERROR, "Employee already exists");
		}
		
	}
	
	public BaseResponse addDepartment(Department department) {
		if (!deptRepository.existsById(department.getId())) {
			try {
				deptRepository.save(department);
				return new BaseResponse(StatusType.SUCCESS, "Added Successfully");
			} catch (Throwable e) {
				e.printStackTrace();
				return new BaseResponse(StatusType.ERROR, "Failed");
			}
		} else {
			return new BaseResponse(StatusType.ERROR, "Employee already exists");
		}
		
	}
	public BaseResponse updateEmployee(int id, Employee employee) {
		if (empRepository.existsById(employee.getId())) {
			try {
				empRepository.save(employee);
				return new BaseResponse(StatusType.SUCCESS, "Updated Successfully");
			} catch (Throwable e) {
				e.printStackTrace();
				return new BaseResponse(StatusType.ERROR, "Failed");
			}
		} else {
			return new BaseResponse(StatusType.ERROR, "Employee does not exist");
		}
	}
	
	public BaseResponse deleteEmployee(int id) {
		if (empRepository.existsById(id)) {
			try {
				empRepository.deleteById(id);
				return new BaseResponse(StatusType.SUCCESS, "Deleted Successfully");
			} catch (Throwable e) {
				e.printStackTrace();
				return new BaseResponse(StatusType.ERROR, "Failed");
			}
		} else {
			return new BaseResponse(StatusType.ERROR, "Employee does not exist");
		}	
	}

}
