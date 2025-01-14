package com.oops;

public class Account {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(int amt) {
		System.out.println("Total balance" + getBalance());
		System.out.println("Deposite Amt" + amt);
		setBalance(getBalance() + amt);
		System.out.println("After Deposite Amt" + getBalance());
	}

	public void withdrawal(int amt) {

		if (getBalance() > amt) {
			System.out.println("Total balance" + getBalance());
			System.out.println("Withdrawl Amt" + amt);
			setBalance(getBalance() - amt);
			System.out.println("After Withdrawl Amt" + getBalance());
		} else {
			System.out.println("paisa ni h mere pass...");
		}
	}

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setBalance(2000);
		ac.deposite(500);
		ac.withdrawal(100);
	}

}
