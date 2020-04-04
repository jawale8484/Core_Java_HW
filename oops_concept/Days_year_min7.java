package oops_concept;

import java.util.Scanner;

public class Days_year_min7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter minutes");
		int min=sc.nextInt();
		
		float year=min/525600f;
		System.out.println("year"+year);
		
		float days=min/1440f;
		System.out.println("days"+days);
		
		
	
	}

}
