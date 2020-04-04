package methods;
//11.	Create a class Account containing following methods :

//insert() to insert account data
//display() to display account information
//deposit() to deposit amount
//withdraw() to withdraw amount 
//checkbalance() to check balance

import java.io.*;
import java.lang.Thread.State;
import java.lang.invoke.SwitchPoint;
import java.util.*;

public class Account_11 {

	static String nm;
	static double amount;
	static int accnum;

	void insertinfo() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account holder name-");
		nm = sc.nextLine();
		System.out.println("Enter Account number-");
		accnum = sc.nextInt();
		System.out.println("Enter Account Balance-");
		amount = sc.nextInt();

	}

	void display() {

		System.out.println("Account Holder name is-" + nm);
		System.out.println("Account number is-" +accnum);
		System.out.println("Account balance is-" + amount);
	}

	void deposit() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter deposit amount");
		double depositamount = sc.nextDouble();
		amount = amount + depositamount;
		System.out.println("After deposit");
		System.out.println("Succesfully deposited....");
		System.out.println("Total Amount is-" + amount);
		

	}

	void withdrawal() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Withdrawal amount");
		
		double withdrawalamount = sc.nextDouble();
		if(withdrawalamount>amount) {
			System.out.println("Sorry...!!Insufficient balance");
			
		}
		else {
		amount = amount - withdrawalamount;
		System.out.println("Collect your Cash of "+withdrawalamount);
		//System.out.println("Toatal amount is-" + amount);
	}
	}
	void chechbalance() {
		System.out.println("Total Account Balance is-" + amount);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account_11 a = new Account_11();
		a.insertinfo();
		int choice;
    do {
		System.out.println("Enter choice \n1-Display\n2-deposit\n3-withdrawal\n4-check-balance\n5-Exit");
		 choice = sc.nextInt();

		switch (choice) {

		case 1:
			a.display();
			break;

		case 2:
			a.deposit();
			break;

		case 3:
			a.withdrawal();
			break;

		case 4:
			a.chechbalance();
			break;

		case 5:
			System.out.println("Exit");
			System.out.println("Thank you for using This Service");
			break;
		}
		}
    while(choice!=5);

	}

}
