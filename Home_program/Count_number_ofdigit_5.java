package Home_program;

import java.util.Scanner;
// 5.	Count number of digits of any number.
public class Count_number_ofdigit_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int count=0;
		while(num!=0) {
			 int ans=num%10;
			 num=num/10;
			count++;
		}
		System.out.println(count);
		
		
	}

}
