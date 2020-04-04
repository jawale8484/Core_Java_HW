package string;

import java.util.Scanner;

/*12.	WAP to delete a character from  given index.*/

public class Delete_char_12 {
	Scanner sc=new Scanner(System.in);
	void buffer() {
		StringBuffer sb1=new StringBuffer("Hello-java");
		//sb1.delete(2, 5);
		sb1.deleteCharAt(3);
		System.out.println(sb1);
		System.out.println(sb1);
	}
	void builde() {
		StringBuilder sb1=new StringBuilder("Laptop");
		//sb1.delete(2, 5);
		sb1.deleteCharAt(3);
		System.out.println(sb1);
		System.out.println(sb1);
	}
	public static void main(String[] args) {
		Delete_char_12 ob=new Delete_char_12();
		ob.buffer();
		ob.builde();
	}
}
