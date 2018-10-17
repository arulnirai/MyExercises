package com.cg.eis.service;

import org.apache.log4j.Logger;

import com.cg.eis.bean.Employee;

/**
 * @author arulnr
 *
 */
public class EmployeeServiceImpl implements EmployeeService {

	Employee em = new Employee();

	static Logger log = Logger.getLogger(EmployeeServiceImpl.class.getName());

	/* Determine the insurance plan based on salary and designation */
	@Override
	public String insuranceSchemePlan(int salary, String designation) {
		String scheme = "";
		if ((salary > 5000 && salary < 20000)
				&& designation.equalsIgnoreCase("System Associate")) {
			scheme = "Scheme A";
		} else if ((salary >= 20000 && salary < 40000)
				&& designation.equalsIgnoreCase("Programmer")) {
			scheme = "Scheme B";
		} else if ((salary >= 40000) && designation.equalsIgnoreCase("Manager")) {
			scheme = "Scheme C";
		} else if ((salary <= 5000) && designation.equalsIgnoreCase("Clerk")) {
			scheme = "No Scheme";
		} else {
			scheme = "Unable to Determine";
		}
		return scheme;
	}

	/* Display or print the employee particulars */
	@Override
	public void displayDetails() {
		log.info(em.toString());
	}

	/* create or get the details of the employee */
	@Override
	public void getDetail(String Id, String name, int salary, String designation) {
		em.setId(Id);
		em.setName(name);
		em.setSalary(salary);
		em.setDesignation(designation);
		em.setInsuranceScheme(insuranceSchemePlan(salary, designation));
	}

}
