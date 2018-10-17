//Author: Arul
package com.capgemini.lab4.Inheritance;

import org.apache.log4j.Logger;

public class CurrentAccount extends Account{

	public double overdraftLimit = -1000;
	private boolean limitexceeded;
	
	static Logger log = Logger.getLogger(CurrentAccount.class.getName());

	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		limitexceeded = false;
	}



	public void withdraw(double value){
		System.out.println(getBalance());
		if((getBalance()- value) < overdraftLimit){
			limitexceeded = true;
		}

		if(limitexceeded == true){
			log.info("overdraft limit exceeded!");
		}
		else{
			double newBalance = getBalance();
			setBalance(newBalance -= value);
			setWithdrawal(value);
		}
		limitexceeded = false;
	}

	public String toString(){
		return "Updated Details\n\nBalance: " + getBalance() + "\nAmount withdrawed: " + getWithdrawal();
	}
}
