package oops_concept;

import java.util.Scanner;

/*5.	Write a program to input all sides of a
triangle and check whether triangle is valid or not. */

public class Sides_of_trangle_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sides of trangles");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		
		if(s1==s2 && s2==s3) {
			System.out.println("Equilataral Trangle");
	} 
		else if (s1==s2 || s2==s3 ||s1==s3){
		System.out.println("Iososales tranfgle");
	}else {
		System.out.println("Scalaen trangle");
	}
}
}
