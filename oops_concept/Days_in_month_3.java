package oops_concept;

import java.util.*;

/*3.	Write a program to input month number and 
print number of days in that month. {Hint- Input-11 Output-30 }
*/
public class Days_in_month_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month number");
		int mono=sc.nextInt();
		
		switch(mono) {
		
		case 1:
			System.out.println("Jan-1 \n31 days");
			break;
		case 2:
			System.out.println("Feb \n28 days");
			break;
		case 3:
			System.out.println("March \n31 days");
			break;
		case 4:
			System.out.println("April \n30 days");
			break;
		case 5:
			System.out.println("MAy \n31 days");
			break;
		case 6:
			System.out.println("June \n30 days");
			break;
		case 7:
			System.out.println("Jul \n31 days");
			break;
		case 8:
			System.out.println("Agust \n31 days");
			break;
		case 9:
			System.out.println("Saptember \n30 days");
			break;
		case 10:
			System.out.println("Octomber \n31 days");
			break;
		case 11:
			System.out.println("November \n 30 days");
			break;
		case 12:
			System.out.println("December  \n31 days");
			break;
		default:
			System.out.println("Invalid input");
		
		
	} 

	}
}
