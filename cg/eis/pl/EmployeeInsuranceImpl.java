package com.cg.eis.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.cg.eis.service.EmployeeServiceImpl;

/**
 * @author arulnr
 *
 */
public class EmployeeInsuranceImpl {
	static Logger log = Logger.getLogger(EmployeeInsuranceImpl.class.getName());
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //use bufferreader for string input
		log.info("Enter ID: ");
		String id = br.readLine();
		log.info("Enter Name: ");
		String name = br.readLine();
		log.info("Enter salary: ");
		int salary = sc.nextInt();
		log.info("\nEnter designation: ");
		String designation = br.readLine();//cannot input this string because reading of enter key
		EmployeeServiceImpl em1 = new EmployeeServiceImpl();
		em1.getDetail(id, name, salary, designation);
		em1.displayDetails();
		sc.close();
		br.close();
	}

}
