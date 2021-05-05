package com.abi.demopoc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.abi.demopoc.models.EmployeeUrl;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan
public class EmployeeConfigurations {
	@Value("${employee.url}")
	private String url;
	
	@Bean
	public EmployeeUrl employeeUrl() {
		
		EmployeeUrl employeeUrl = new EmployeeUrl();
		employeeUrl.setUrl(url);
		return employeeUrl;
	}
}
