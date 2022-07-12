package com.rest.assignment2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

//defines that a class can be mapped to a table
@Entity
//generates getters and setters for all fields
@Data
public class Employee {

	// initializing all the properties for the Employee table
	@Id
	private int id;
	private String name;
	private String position;
	private double salary;
	private int dep_id;
	
	public int getId() {
		return id;
	}

}
