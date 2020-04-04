package Home_program;

import java.util.*;
import java.io.*;

public class Calc {
	public static void main(String[] args) {
		double output;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number-");
		int num1=sc.nextInt();
		System.out.println("Enter second number-");
		int num2=sc.nextInt();
		System.out.println("Enter opertion-");
		char ch=sc.next().charAt(0);
		
		switch (ch) {
		case '+':
			output=num1+num2;
		  System.out.println("Addition is="+output);
		break;
		case '-':
			output=num1-num2;
			System.out.println("Substraction is="+output);
		break;
		case '*':
			output=num1*num2;
			System.out.println("Substarcion is="+output);
		break;
		case '/':
			output=num1/num2;
			System.out.println("Division is="+output);
		break;	
		default:
			System.out.println("invalid input");
		}
		
		
	}

}
