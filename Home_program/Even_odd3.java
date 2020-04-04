package Home_program;

import java.util.*;

public class Even_odd3 {

	public static void main(String[] args) {
		
		
		System.out.println("Even number are");
		for (int i = 1; i<=100; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
				
		}
		
		System.out.println("Odd number are");
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
