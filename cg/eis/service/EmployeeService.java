package com.cg.eis.service;

/**
 * @author arulnr
 *
 */
public interface EmployeeService {
	
	public abstract void getDetail(String Id, String name, int salary, String designation);
	
	public abstract String insuranceSchemePlan(int salary, String designation);
	
	public abstract void displayDetails();
}
