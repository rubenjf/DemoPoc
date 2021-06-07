package com.abi.demopoc.models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"First_Name",
"Last_Name",
"Email_Address"
})
@Generated("jsonschema2pojo")
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

@JsonProperty("First_Name")
private String firstName;
@JsonProperty("Last_Name")
private String lastName;
@JsonProperty("Email_Address")
private String emailAddress;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("First_Name")
public String getFirstName() {
return firstName;
}

@JsonProperty("First_Name")
public void setFirstName(String firstName) {
this.firstName = firstName;
}

public Employee withFirstName(String firstName) {
this.firstName = firstName;
return this;
}

@JsonProperty("Last_Name")
public String getLastName() {
return lastName;
}

@JsonProperty("Last_Name")
public void setLastName(String lastName) {
this.lastName = lastName;
}

public Employee withLastName(String lastName) {
this.lastName = lastName;
return this;
}

@JsonProperty("Email_Address")
public String getEmailAddress() {
return emailAddress;
}

@JsonProperty("Email_Address")
public void setEmailAddress(String emailAddress) {
this.emailAddress = emailAddress;
}

public Employee withEmailAddress(String emailAddress) {
this.emailAddress = emailAddress;
return this;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

public Employee withAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
return this;
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(Employee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("firstName");
sb.append('=');
sb.append(((this.firstName == null)?"<null>":this.firstName));
sb.append(',');
sb.append("lastName");
sb.append('=');
sb.append(((this.lastName == null)?"<null>":this.lastName));
sb.append(',');
sb.append("emailAddress");
sb.append('=');
sb.append(((this.emailAddress == null)?"<null>":this.emailAddress));
sb.append(',');
sb.append("additionalProperties");
sb.append('=');
sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
sb.append(',');
if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

}