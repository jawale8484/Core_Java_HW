package array;

import java.util.Scanner;

//1.	WAP to create 1D array
//and accept data in that array. Calculate the average value of array elements.
public class Calculate_average_array_1 {
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
		 //calculation of average
		int result=0;
		
		for (int i = 0; i < size; i++) {
			result=result+arr[i];			
		}
		System.out.println();
		System.out.println("addition of array-"+result);
		int avr=result/size;
		System.out.println("Average of array is "+avr);
	}

}
