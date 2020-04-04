package string;

import java.util.Scanner;

/*10.	Write a Java
program to trim both leading and trailing white space characters in a string.
*/
public class Trim_strimg_10 {
	Scanner sc =new Scanner(System.in);
	void buffer() {
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
		StringBuffer bs=new StringBuffer(s);
		String s1=bs.toString(); //convert string buffer to string		
		
		s1.trim();
		System.out.println(s1);
		System.out.println(s1.trim());	
		
	}
	public static void main(String[] args) {
		Trim_strimg_10 ob=new Trim_strimg_10();
		ob.buffer();
	}
}
