package com.rest.assignment2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.assignment2.model.Department;

//gets the repository instance injected that extends CrudRepository
@Repository
public interface DeptRepository extends CrudRepository<Department,Integer> { 
	
}
