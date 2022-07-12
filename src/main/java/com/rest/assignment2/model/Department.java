package com.rest.assignment2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Department {
	
	@Id
	private int id;
	private String dep_name;

	public int getId() {
		return id;
	}
}
