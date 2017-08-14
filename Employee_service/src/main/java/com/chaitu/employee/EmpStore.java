package com.chaitu.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpStore {

	ArrayList emplist = new ArrayList<Employee>();
	
	public  EmpStore(){
		
		//Map to store employees, ideally we should use database
				
				Employee emp1 = new Employee(116154,"chaitu","software Engineer");
				Employee emp2 = new Employee(18854,"john","software Engineer");
				Employee emp3 = new Employee(99954,"peter","software Engineer");
				Employee emp4 = new Employee(323154,"michel","software Engineer");
				Employee emp5 = new Employee(808987,"thomos","software Engineer");
				Employee emp6 = new Employee(11111,"TechM","software Engineer");
				Employee emp7 = new Employee(22222,"Cawner","software Engineer");
				emplist.add(emp1);
				emplist.add(emp2);
				emplist.add(emp3);
				emplist.add(emp4);
				emplist.add(emp5);
				emplist.add(emp6);
				emplist.add(emp7);
				
		
	}
	
	public List getList(){
		
		return emplist;
		
	}

	public String createEmployee(Employee obj) {
		
		emplist.add(obj);
		
		return "New Employee Saved Sucessfully..";
	}

	public String remove(int empId) {
		// TODO Auto-generated method stub
		emplist.remove(empId);
		
		return "Employee removed";
	}
	
	
	
}
