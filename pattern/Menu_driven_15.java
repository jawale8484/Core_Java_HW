package pattern;

import java.util.Scanner;

public class Menu_driven_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Eneter the choice");
			System.out.println("1-prime no");
			System.out.println("2-Even no");
			System.out.println("3-Odd no");
			System.out.println("4-Exit");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Prime no are-");
				for (int i = 1; i <= 100; i++) {
					int count = 0;
					for (int j = 1; j <= i; j++) {
						if (i % j == 0) {
							count++;
						}
					}
					if (count == 2) {
						System.out.println(i);
					}

				}
				break;
			case 2:
				System.out.println("Even no are-");
				for(int i=1;i<=100;i++) {
					if(i%2==0) {
						System.out.println(i);
					}
				}
				break;
			case 3:
				System.out.println("Odd no are-");
				for(int i=1;i<=100;i++) {
					if(i%2!=0) {
						System.out.println(i);
					}
				}
				break;
			case 4: System.out.println("Exits");
				break;
				
			default:
				System.out.println("Invalid  choice");
			}
				
		} while (choice != 4);

	}
}
