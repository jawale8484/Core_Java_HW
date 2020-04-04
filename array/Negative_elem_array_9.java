package array;

import java.util.Scanner;

/*9.	WAP to print all negative elements in an 
array and also count total number of negative elements in an array.*/
public class Negative_elem_array_9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter "+size+" emelents in array");
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Element's in array are-");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i]+" ");
		}
	
	//negative  number
	
		System.out.println("\n negative numbers are-");
		int count=0;
	   for (int i = 0; i < size; i++) {
		if(arr[i]<0) {
			System.out.println(arr[i]+" ");
			count++;
		}
	}
	   
	   System.out.println("Count negative numbers are- "+count);
	}
	
	
	

}
