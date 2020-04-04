package Home_program;

import java.util.Scanner;

public class Gross_salary11 {
	
	public static void main(String[] args) {
		double hra=0;
		double da=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter Salary");
		double sal=sc.nextInt();
		
		if(sal<=10000) {
			hra=sal*0.20;
			System.out.println("HRA="+hra);
			da=sal*0.80;
			System.out.println("DA="+da);
		}
		else if(sal<=20000) {
			hra=sal*0.25;
			System.out.println("HRA="+hra);
			da=sal*0.90;
			System.out.println("Da="+da);
			
		}
		else if(sal>20000) {
			hra=sal*0.30;
			System.out.println("HRA="+hra);
			da=sal*0.90;
			System.out.println("Da"+da);
		}
	}

}
