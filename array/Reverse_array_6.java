package array;

import java.util.Scanner;

//6.	WAP to print reverse of an array.
public class Reverse_array_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		// array declaration
		int arr[] = new int[size];

		System.out.println("Enter " + size + " elments in array-");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Entered Elements in array are-");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		// reverse array 
		System.out.println("\n Reverse array are-");
		for (int i=size-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
