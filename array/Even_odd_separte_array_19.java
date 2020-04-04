package array;

import java.util.Scanner;

//19.	Write a Java program to separate even and odd numbers of an given
//array of integers. Put all even numbers first, and then odd numbers.

public class Even_odd_separte_array_19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];   //first array
		int arr1[]=new int[arr.length];	//second array
		
		
		System.out.println("Enter "+size+" Elements in array");
		for (int i = 0; i <size; i++) {
			arr[i]=sc.nextInt();
			}
		System.out.println("Elements in array");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("In Second array ");
	//	System.out.println("Even");
		int count=0;
		for (int i = 0; i < arr1.length; i++) {
			if(arr[i]%2==0) {
				arr1[i]=arr[i];
				System.out.println(arr1[i]);
				count++;
			}
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			if(arr[i]%2!=0) {
				arr1[count]=arr[i];
				System.out.println(arr1[count]);
			
			}
		}
		
	}

}
