package com.abi.demopoc.models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Employee No.",
"Employee Name",
"Gender",
"Birth_date",
"Hire_date"
})
@Generated("jsonschema2pojo")
public class Employee {

@JsonProperty("Employee No.")
private String employeeNo;
@JsonProperty("Employee Name")
private String employeeName;
@JsonProperty("Gender")
private String gender;
@JsonProperty("Birth_date")
private String birthDate;
@JsonProperty("Hire_date")
private String hireDate;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@Bean
public Employee employee() {
	return new Employee();
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(Employee employee) {
	// TODO Auto-generated constructor stub
}

@JsonProperty("Employee No.")
public String getEmployeeNo() {
return employeeNo;
}

@JsonProperty("Employee No.")
public void setEmployeeNo(String employeeNo) {
this.employeeNo = employeeNo;
}

@JsonProperty("Employee Name")
public String getEmployeeName() {
return employeeName;
}

@JsonProperty("Employee Name")
public void setEmployeeName(String employeeName) {
this.employeeName = employeeName;
}

@JsonProperty("Gender")
public String getGender() {
return gender;
}

@JsonProperty("Gender")
public void setGender(String gender) {
this.gender = gender;
}

@JsonProperty("Birth_date")
public String getBirthDate() {
return birthDate;
}

@JsonProperty("Birth_date")
public void setBirthDate(String birthDate) {
this.birthDate = birthDate;
}

@JsonProperty("Hire_date")
public String getHireDate() {
return hireDate;
}

@JsonProperty("Hire_date")
public void setHireDate(String hireDate) {
this.hireDate = hireDate;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}