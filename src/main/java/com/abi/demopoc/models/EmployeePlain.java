package com.abi.demopoc.models;

import org.springframework.context.annotation.Bean;

public class EmployeePlain {
	private String response;

	@Bean
	public Weather weather() {
		return new Weather();
	}

	public EmployeePlain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeePlain(EmployeePlain employeeplain) {
		// TODO Auto-generated constructor stub
	}
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

}
