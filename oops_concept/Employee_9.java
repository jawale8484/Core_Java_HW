package oops_concept;

import java.util.Scanner;

//9.	A company decided to give bonus of 5% to employees if his/her year 
//of service is more than 5 years. Ask user for their 
//salary and year of service and print the net bonus amount.

public class Employee_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int service = 2019;
		System.out.println("Enter year of sarvice");
		int yr = sc.nextInt();
		System.out.println("Enetr salary-");
		double sl = sc.nextDouble();

		if (yr  > 5) {
			double bonus = sl * 0.05;
			System.out.println("Bonus Amount-" + bonus);
			
		}
	}

}
