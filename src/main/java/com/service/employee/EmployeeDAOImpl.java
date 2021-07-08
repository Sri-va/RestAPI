package com.service.employee;

import java.util.ArrayList;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public ArrayList<Employee> getEmployeelist() {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Sri", 100);
		Employee e2=new Employee("Sriva", 101);
		ArrayList<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		
		return list;
	}

}
