package string;
//5.	Write a Java program to count total number of words in a string.

import java.util.Scanner;

public class Count_String_5 {
	Scanner sc = new Scanner(System.in);

	void display() {
		System.out.println("Enter the sentenace");
		String s = sc.nextLine();

		int count = 0;
		String[] ch = s.split(" ");
		for (int i = 0; i < ch.length; i++) {
			count++;
		}
		System.out.println("Total number of words -" + count);
		
	}

	public static void main(String[] args) {
		Count_String_5 ob=new Count_String_5();
		ob.display();
	
	
	}
}