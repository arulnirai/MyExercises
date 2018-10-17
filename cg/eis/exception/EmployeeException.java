package com.cg.eis.exception;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;

class SalaryException extends Exception {
	private static final long serialVersionUID = 1L;

	public SalaryException(String str){
		super(str);
	}
}

/**
 * @author arulnr
 *
 */
public class EmployeeException{
	static Logger log = Logger.getLogger(EmployeeException.class.getName());
	public static void main(String[] args) throws SalaryException{
		Employee em = new Employee();
		EmployeeServiceImpl em1 = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		log.info("Enter salary amount: ");
		int salary = sc.nextInt();
		if(salary < 3000){
			throw new SalaryException("Salary cannot be below $3000");
		}
		em1.getDetail("S12345L", "Reema", salary, "Programmer");
		em1.displayDetails();
	}
}