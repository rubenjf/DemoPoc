package com.abi.demopoc.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.abi.demopoc.models.Employee;
import com.abi.demopoc.models.EmployeePlain;
import com.abi.demopoc.models.EmployeeUrl;
import com.abi.demopoc.models.FormEmployeeAttribute;
import com.fasterxml.jackson.databind.ObjectMapper;

@ComponentScan("com.abi.demopoc.config")
@Controller
public class EmployeeController {
	@Autowired
	RestTemplate restTemp;
	
	@Autowired
	private EmployeeUrl employeeData;
	@RequestMapping(value = "/employee",method=RequestMethod.GET )
	public ModelAndView EmployeeForm() {
		
		return new ModelAndView("employeeFormData", "employee", new FormEmployeeAttribute());
	}
	
	@RequestMapping(value = "/employee", method=RequestMethod.POST)
	public String getEmployeeLocation(Model model, @ModelAttribute FormEmployeeAttribute employee) 
		throws IOException{
		UriComponents uriComponents = UriComponentsBuilder
				.newInstance()
				.scheme("http")
				.host(employeeData.getUrl())
			    .path("")
			    .queryParam("ParamTest1",employee.getFirstName())
			    .queryParam("ParamTest2",employee.getLastName())
			    .build();
		
		String uri = uriComponents.toUriString();
		
		ResponseEntity<String> resp= restTemp.exchange(uri, HttpMethod.GET, null, String.class);
		
//		Employee emp = new EmployeePlain();
//		emp.processResponse(resp.getBody());
//		
//		ObjectMapper mapper = new ObjectMapper();
//		Employee employ = mapper.readValue(resp.getBody(), Employee.class);
//		model.addAttribute("weatherData", employ);
		model.addAttribute("employeeResponse",resp.getBody());	
		return "employeeDetails";
	}

}
