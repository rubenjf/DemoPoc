package com.abi.demopoc.models;

public class Employee {
	private String firstName;
	private String lastName;
	private String location;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	/*
	 * Response Comes like below
	 * Status Code: 200 
	 * firstName: Ruben 
	 * lastname: Fernando 
	 * location: India
	 */
	
	public void processResponse(String response) {
		String[] lines = response.split("\\r?\\n");
		for (String line : lines) {
			String[] data = line.split("\\:");
			if(data[0] == "firstName") {
				this.firstName = data[1];
			}else if(data[0] == "lastName") {
				this.lastName = data[1];
			}else if(data[0] == "location") {
				this.location = data[1];
			}
		}
	}
	

}
