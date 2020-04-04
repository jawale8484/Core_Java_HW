package array;

import java.util.Scanner;

//11.	WAP to put even and odd elements of array in two separate arrays.
public class Eeven_odd_Separated_11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter size af array-");		
		int size=sc.nextInt();
		
		int arr[]=new int[size];   //first array....
		
		
		System.out.println("Enter "+size+" elments in array");
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();			
		}
		
		System.out.println("Elements in array-");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);			
		}
		
		
		int odd[]=new int[50];    //second array....
		
		System.out.println("Odd numbers are-");
		for (int i = 0; i < odd.length; i++) {
			if(arr[i]%2!=0) {
				odd[i]=arr[i];				
			}
			System.out.println(odd[0]);
		}
		
		int even[]=new int[size];    //third array....
		
		System.out.println("Even numbers are-");
		for (int i = 0; i < even.length; i++) {
		if(arr[i]%2==0) {
			even[i]=arr[i];
			//System.out.println(even[0]);
		}
	}	
	}
	
	
	
	
	
	

}
