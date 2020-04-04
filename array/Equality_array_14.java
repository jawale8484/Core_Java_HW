package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//14.	Write a Java program to test the equality of two arrays.
public class Equality_array_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first size of array");
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

		System.out.println("\n Enter the size second of array");
		int size1 = sc.nextInt();

		int arr1[] = new int[size1];// array declaration

		System.out.println("Enter " + size1 + " elements in array");
		for (int i = 0; i < size1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("\n Entered elemntas in array are-");
		for (int i = 0; i < size1; i++) {
			System.out.print(arr[i] + " ");
		}
	
		
		for (int i = 0; i < arr.length; i++) {			
				if(arr[i]==arr1[i]) {
					System.out.println("yes");
				}
			}
		}
	}

