package methods;
//4.	Write a program to find the smallest number among three numbers

import java.util.Scanner;

public class Smallest_no_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers-");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 < num2 && num1<num3) {
			System.out.println("Num1 is Smallest-"+num1);
		}
		else if(num2<num1 && num2<num3) {
			System.out.println("Num2 is Smallest-"+num2);
		}
		else { 
			System.out.println("Num3 is smallest-"+num3);
	}}
}
