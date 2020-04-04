package Home_program;

import java.util.Scanner;
//6.	Display all elements between 400 to 500 
//(both numbers excluded) ending with seven.{Hint: output-407,417,427….}


public class DispalyAllElement_6 {
	public static void main(String[] args) {

	
		for(int i=400;i<=500;i++) {
			if(i%10==7) {
				System.out.println(i);
			}
		}
		int num=407;
		for(int i=0;i<=9;i++) {
			 //System.out.println(num);
			 num=num+10; 
		}
	}

}
