package array;

import java.util.Scanner;

public class Array_class {
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
	}

}
