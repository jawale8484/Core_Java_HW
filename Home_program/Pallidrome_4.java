package Home_program;

import java.util.Scanner;

public class Pallidrome_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int ognum=num;
		int temp=0;
		while(num!=0) {
			int remainder=num%10;
			temp=(temp*10)+remainder;
			num=num/10;
		 
	}
		if(ognum==temp) {
			System.out.println(ognum+" pallindrome");
		}
		else {
			System.out.println(ognum+" not pallindrome");
		}
	

		
}}
