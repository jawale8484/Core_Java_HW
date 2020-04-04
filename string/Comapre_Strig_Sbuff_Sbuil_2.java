package string;

import java.util.Scanner;

//2.	Compare string using ==.

public class Comapre_Strig_Sbuff_Sbuil_2 {
	Scanner sc = new Scanner(System.in);

	void check() {
		System.out.println("Enter first string");
		String s1 = sc.next();
		

		System.out.println("Enter second string");
		String s2 = sc.next();
			
		System.out.println(" After compare..");
		
		
		
		//if (sb1==sb2)  // these is check address of object and give false condition
		
		if(s1.equals(s2)){
			System.out.println("String are equals");
		}else {
			System.out.println("String not equals");
		}

	}
	public static void main(String[] args) {
		 Comapre_Strig_Sbuff_Sbuil_2 ob=new Comapre_Strig_Sbuff_Sbuil_2();
		 ob.check();
	}

}
