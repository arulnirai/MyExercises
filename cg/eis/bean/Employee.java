package com.cg.eis.bean;

/**
 * @author arulnr
 *	Employee class has the getter and setter methods to get the employee's particulars
 */
public class Employee {

	private String id;
	private String name;
	private int salary;
	private String designation;
	private String insuranceScheme;

	public Employee() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	public String toString(){
		return "Details of Employee"
				+ "\n========================="
				+ "\nID: " + getId() 
				+ "\nName: " + getName() 
				+ "\nSalary: " + getSalary()
				+ "\nDesignation: " + getDesignation()
				+ "\nInsurance scheme: " + getInsuranceScheme();
	}
}
