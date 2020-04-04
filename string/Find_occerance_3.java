package string;
//3.	 Write a Java program to count occurrences of a given character in given string.

import java.util.Scanner;

public class Find_occerance_3 {
	Scanner sc =new Scanner(System.in);
	void find() {
		System.out.println("Enter a string");
		String s1=sc.nextLine();
		
		System.out.println("Enter a character fot count occurrences");
		char c=sc.next().charAt(0);
				
				
		char[]ch=s1.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
					if(ch[i]==c)
					{
						count++;
					}
				}
		System.out.println("count of "+c+" is "+count);
	
	}
	public static void main(String[] args) {
		Find_occerance_3 ob=new Find_occerance_3();
		ob.find();
	}

}
