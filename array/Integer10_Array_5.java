package array;

import java.util.Scanner;

//5.	Take 10 integer inputs from user and print the following:
//number of positive numbers
//number of negative numbers
//number of odd numbers
//number of even numbers

public class Integer10_Array_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array-");
		int size=sc.nextInt();
		
		int arr[]=new int[size];  //array declaration
		
		System.out.println("Enter "+size+" Elements in array-");
		for (int i = 0; i < size; i++) {
		arr[i]=sc.nextInt();
		}		
		System.out.println("Elements in array are-");
		for (int j = 0; j < arr.length; j++) {			
			System.out.print(arr[j]+" ");
		}
		
		//Positive number are-
		System.out.println();
		System.out.println("Positive numbers are-");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0) {
				System.out.print(arr[i]+" ");
			}
		}
		
		//negative number are-
		System.out.println();
		System.out.println("Negative numbers are-");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0) {
				System.out.print(arr[i]+" ");
			}
		}
		
		//odd numbers are-
		System.out.println();
		System.out.println("Odd Numbers are-");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		//Even number are-
		System.out.println();
		System.out.println("Even numbers are");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
