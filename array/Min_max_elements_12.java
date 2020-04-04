package array;

import java.util.Scanner;

//12.	WAP to find the maximum and minimum value in an array.
public class Min_max_elements_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int arr[] = new int[size];// array declaration

		System.out.println("Enter " + size + " elements in array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Entered elemntas in array are-");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println("\n Miximum elements in array-");

		System.out.println(temp);

		System.out.println("minimum number in array");

		System.out.println(arr[0]);
		
		
//		13.	WAP to find the second smallest element in an array.
		System.out.println("Second smallest elemnts in array");
		System.out.println(arr[1]);

	}
}
