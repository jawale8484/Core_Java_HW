package array;

import java.util.Scanner;

//10.	Write a Java program to find sum of elements of an array.
public class Sum_elements_array_10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter size af array-");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter "+size+" elments in array");
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();			
		}
		
		System.out.println("Elements in array-");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);			
		}
		int sum=0;
		System.out.println("sum of elements in array");
		for (int i = 0; i < size; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
	}

}
