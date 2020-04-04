package array;

import java.util.Scanner;

public class Reverse_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter "+size+" elemntes in array");
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements in array are-");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n Reverse array...");
		for(int i=size-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
