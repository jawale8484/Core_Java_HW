package Home_program;

import java.util.*;

public class Neg_Pos_Zero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number-");
		int num=sc.nextInt();
		
		if(num<0) {
			System.out.println("number is negative");
		}
		else if(num==0) {
			System.out.println("number is zero");
		}
		else if(num>0) {
			System.out.println("number is posiotive");
		
		}
		
	}

}
