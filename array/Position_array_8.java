package array;

import java.util.Scanner;

//8.	WAP to insert an element in a specific position into an array.
public class Position_array_8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter "+size+" elements in array");
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();			
		}
		
		System.out.println("Elemnts in array");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter posistion");
		int pos=sc.nextInt();
		
		System.out.println("Enter Element");
		int el=sc.nextInt();
		
		arr[pos-1]=el;
		System.out.println("After ");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
				
	}
	
}
