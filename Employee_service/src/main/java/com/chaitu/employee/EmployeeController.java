package com.chaitu.employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the Employee service.
 */
@Controller
@RequestMapping("empAPI")
public class EmployeeController {
	
	Map<Integer, Employee> empData = new HashMap<Integer, Employee>();
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	@RequestMapping(value = EmpRestURIConstants.DUMMY_EMP, method = RequestMethod.GET)
	public @ResponseBody Employee getDummyEmployee() {
		
		logger.info("Start get Dummy Employee Details");
		Employee emp = new Employee(9999, "Dummy", "sales Person");
		empData.put(9999, emp);
		return emp;
	}
	
	@RequestMapping(value = EmpRestURIConstants.GET_EMP, method = RequestMethod.POST)
	public @ResponseBody Employee getEmployee(@PathVariable("id") int empId) {
		logger.info("Start getEmployee. ID="+empId);
		
		return empData.get(empId);
	}
	
	@RequestMapping(value = EmpRestURIConstants.GET_ALL_EMP, method = RequestMethod.GET)
	public @ResponseBody List<Employee> getAllEmployees() {
		logger.info("Start get All Employees.");
		EmpStore obj = new EmpStore();
		return obj.getList();
		
	}
	
	@RequestMapping(value = EmpRestURIConstants.DELETE_EMP, method = RequestMethod.POST)
	public @ResponseBody String deleteEmployee(@PathVariable("id") int empId) {
		logger.info("Start deleteEmployee.");
		EmpStore empData = new EmpStore();
		empData.remove(empId);
		return "Employee removed";
	}
	
}