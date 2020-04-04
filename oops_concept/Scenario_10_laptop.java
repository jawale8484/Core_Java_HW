package oops_concept;

import java.util.Scanner;

public class Scenario_10_laptop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
		System.out.println("1-Add");
		System.out.println("2-substract");
		System.out.println("3-multiply");
		System.out.println("4-Quit");
		
		System.out.println("Enter a choice");
		 choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("Enter the two number to be added");
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			int c=a+b;
			System.out.println("The result-"+c);
			break;
			
		case 2:
			System.out.println("Enter the two number to be substract");
			int p=sc.nextInt();
			int q=sc.nextInt();
			int r=p-q;
			System.out.println("The result-"+r);
			break;
			
		case 3:
			System.out.println("Enter the two number to be multiply");
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=x*y;
			System.out.println("The result-"+z);
			break;
			
		case 4:
			System.out.println("Exits");
			break;
			
		default: System.out.println("Invallid choice");	
		break;
			
		}
		}while(choice!=4);
		
	}
}
