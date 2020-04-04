package oops_concept;

import java.util.Scanner;

//6.Write a program to enter length in centimetre and
//convert it into meter and kilometre

public class Centimeter_meter_kelometer_6 {
	public static void main(String[] args) {
		double meter = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length in centimeter-");
		double ln=sc.nextDouble();
		
		
	    double Meter = ln/100;
		System.out.println("meter"+meter);
		
	}

}
