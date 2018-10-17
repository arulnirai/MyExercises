//Author: Arul
package com.capgemini.lab4.Inheritance;

public class Account {
	//class level variable
	private long accNum;
	private double balance;
	private Person accHolder;
	private double withdraws;
	public final double MINBAL = 500.0;

	public Account(long accNum, double balance, Person accHolder){
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;

	}

	public void deposit(double value){
		balance += value;
		setBalance(balance);
	}

	public void withdraw(double value){
		balance -= value;
		setWithdrawal(value);
	}

	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setWithdrawal(double value){
		withdraws += value;
	}
	
	public double getWithdrawal(){
		return withdraws;
	}
	
	public String toString(){
		return "Updated Details\n\nBalance " + getBalance() + "\nAmount withdrawed: " + getWithdrawal();
	}
	
}
