package Home_program;
//1.	Display numbers from 1 to 100 using different loops.

public class Print1_100_1st {
	public static void main(String[] args)
	{
		//for loop
		
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
		//do while
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=100);
		
		//while loop
		int j=1;
		while(j<=100) {
			System.out.println(j);
			j++;
		}
	}

}
