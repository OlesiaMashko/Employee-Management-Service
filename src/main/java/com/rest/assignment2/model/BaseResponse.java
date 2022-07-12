package com.rest.assignment2.model;

//creates the the status and message for responses
public class BaseResponse {
	
	private StatusType status;
	private String description;
	
	public BaseResponse(StatusType status, String description) {
		super();
		this.status = status;
		this.description = description;
	}
	
	public StatusType getStatus() {
		return status;
	}
	
	public void setStatus(StatusType status) {
		this.status = status;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
