package com.example.restapi;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.employee.Employee;
import com.service.employee.EmployeeDAOImpl;

@Path("controller")
public class Controller {

	@GET
	@Path("/employee")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmployee() {
		
		EmployeeDAOImpl emp=new EmployeeDAOImpl();
		ArrayList<Employee> list=new ArrayList<>();
		list=emp.getEmployeelist();
		try {
			return new ObjectMapper().writeValueAsString(list);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			return "No data found";
		}
	}
}
