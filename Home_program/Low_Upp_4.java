package Home_program;

import java.util.*;

public class Low_Upp_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character-");
		char ch=sc.next().charAt(0);
		
		//String ch=sc.next();
		
		if(ch>=65 && ch<=90) {
			System.out.println("Upper Case");
		}
		else if(ch>=97 && ch<=122)
			System.out.println("Lower case");
		
	}

}
