package Home_program;

import java.util.Scanner;

public class Alpa_digit_chat10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Something");
	char ch=sc.next().charAt(0);
	
	if(ch>=65 && ch<=90) {
		System.out.println("Uppercase Alphabate");
	}
	else if(ch>=97 && ch<=122) {
		System.out.println("Lowercase Alphabate");
	}
	else if(ch>=48 && ch<=57) {
		System.out.println("Digit");
		
	}
	else if(ch>=33 && ch<=47) {
		System.out.println("Special character");
	}
	
}
}
