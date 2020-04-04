package Home_program;

import java.util.Scanner;

public class Table_3 {
  public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the  number");
	int num=sc.nextInt();
	
	for(int i=1;i<=10;i++) {
	int ans=num*i;
	System.out.println(ans);
	//	System.out.println(	num*i);
		
	}
}
}
