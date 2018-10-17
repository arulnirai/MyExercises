//Author: Arul
package com.capgemini.lab4.Inheritance;

import org.apache.log4j.Logger;

public class SavingAccount extends Account {
	
	public final double MINBAL = 500.0;
	private double balance;
	private Person accHolder;
	
	static Logger log = Logger.getLogger(SavingAccount.class.getName());
	
	public SavingAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		this.balance = getBalance();
		this.accHolder = accHolder;
	}

	@Override
	public void withdraw(double value){
		if((balance - value) >= MINBAL){
			setBalance(balance -= value);
			setWithdrawal(value);
		}
		else{
			log.info("Unable to withdraw!");
		}
	}
	
	public String toString(){
		return "Updated Details\n\nBalance " + getBalance() + "\nAmount withdrawed: " + getWithdrawal();
	}
	
	
}
