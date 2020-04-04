package string;
//11.	WAP to reverse a string or sentences.

import java.util.Scanner;

public class Reverse_String_Sentenace_11 {
	Scanner sc = new Scanner(System.in);

	void reverse() {
		System.out.println("Eneter a string");
		String s=sc.nextLine();
		
		StringBuffer sb1=new StringBuffer(s);
		
		sb1.reverse();
		System.out.println("After reverse String-\t"+ sb1);
	}
	
	void builder() {
		System.out.println("Eneter a  second string");
		String s=sc.nextLine();
		
		StringBuilder sb1=new StringBuilder(s);
		
		sb1.reverse();
		System.out.println("After reverse String-\t"+ sb1);

	}
	
	
	public static void main(String[] args) {
		Reverse_String_Sentenace_11 ob=new Reverse_String_Sentenace_11();
		ob.reverse();
		ob.builder();
	}
}
