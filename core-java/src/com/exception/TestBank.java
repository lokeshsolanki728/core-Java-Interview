package com.exception;

public class TestBank {
/**
 * in this class sir set the Balance after catch block and sout the getBalance
 * then ask what is the output
 * you just write the exception message and first setBalance(100) + deposit
 * (100) +second setBalance(100) =300 okk
 */
public static void main(String[] args) {
	BankAccount ba = new BankAccount();
	ba.setBalance(100);
	ba.deposit(100);
	try {
		System.out.println(ba.withdraw(201));
	}catch(BankExceptionn e){
		System.out.println(e);
	}
}
}
