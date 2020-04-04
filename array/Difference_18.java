package array;
//18.	Write a Java program to get the difference between the
//largest and smallest values in
//an array of integers. The length of the array must be 1 and above

import java.util.Scanner;

public class Difference_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter " + size + " element in array-");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Entered elements in array are-");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		int temp = 0;
		for (int i = 0; i < size; i++) {
		
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
				
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Soreted Elements in array-");
		for (int i = 0; i < size; i++) {
			//System.out.print(arr[i]+" "); 
		}
		
		System.out.println("maximum");
		System.out.println(temp);

		System.out.println("minimum");
		System.out.println(arr[0]);
		
		
		
		System.out.println("difference betwwen max and min");
		int diff=temp-arr[0];
		System.out.println(diff);
	}


}
