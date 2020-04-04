package oops_concept;

import java.util.Scanner;

/*
4.	Write a program to input angles of a 
  triangle and check whether triangle is valid or not. 
*/
public class Trangle_Find_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter angles of trangles");
		int an1=sc.nextInt();
		int an2=sc.nextInt();
		int an3=sc.nextInt();
		
		if(an1+an2+an3==180) {
			System.out.println("It is Valid Trangle");
		}
		else {
			System.out.println("Invalid trangle");
		}
	}
}
