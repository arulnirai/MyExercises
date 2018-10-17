//Author: Arul
package com.capgemini.lab4.InheritanceImpl;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.capgemini.lab4.Inheritance.Account;
import com.capgemini.lab4.Inheritance.CurrentAccount;
import com.capgemini.lab4.Inheritance.Person;
//import com.capgemini.lab4.Inheritance.SavingAccount;


public class AcountImpl {

	static Logger log = Logger.getLogger(AcountImpl.class.getName());

	public static void main(String[] args) {
		double value;
		Scanner sc = new Scanner(System.in);
		log.info("Enter your name and age: ");
		Person accHolder = new Person();
		String name = sc.nextLine();
		float age = sc.nextInt();
		accHolder.setName(name);
		accHolder.setAge(age);
		log.info("Enter your account number: ");
		long accNum = sc.nextLong();
		log.info("Enter the balance amount: ");
		double balance = sc.nextDouble();
		
		Account ac = new CurrentAccount(accNum, balance, accHolder);
		do{
			log.info("Please choose from the below options\n1) Deposit\n2) Withdraw");
			int userInput = sc.nextInt();

			switch(userInput){
			case 1: {
				System.out.println("Please enter the deposit amount");
				value = sc.nextDouble();
				ac.deposit(value);
				log.info(ac.toString());
				break;
			}
			case 2: {
				System.out.println("Please enter the withdrawal amount");
				value = sc.nextDouble();
				ac.withdraw(value);
				log.info(ac.toString());
				break;
			}
			default:
				log.info("Invalid Option!\nPlease enter the right option!");
			}
			log.info("Would you like to continue? (Y/N)");
		}while(sc.next().charAt(0) != 'N');
		log.info("Thank you!");
		sc.close();
	}

}
