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
"First_Name",
"Last_Name",
})
@Generated("jsonschema2pojo")
public class Employee {

@JsonProperty("First_Name")
private String firstName;
@JsonProperty("Last_Name")
private String lastName;
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

@JsonProperty("First_Name")
public String getFirstName() {
return firstName;
}

@JsonProperty("First_Name")
public void setFirstName(String firstName) {
this.firstName = firstName;
}

@JsonProperty("Last_Name")
public String getLastName() {
return lastName;
}

@JsonProperty("Last_Name")
public void setLastName(String lastName) {
this.firstName = lastName;
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