package Home_program;

import java.util.Scanner;

public class Swap_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int temp=0;
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
