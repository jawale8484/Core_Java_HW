package oops_concept;

import java.util.Scanner;

/*
2.	Write a program to enter two angles 
of a triangle and find the third angle.
*/
public class Find_angle_2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First  angle of trangle-");
	int an1=sc.nextInt();
	System.out.println("Enetr second angle of trangle-");
	int an2=sc.nextInt();
	
	int an3=180-(an1+an2);
	System.out.println("Third angle of trangle is-"+an3);
	
}
}
