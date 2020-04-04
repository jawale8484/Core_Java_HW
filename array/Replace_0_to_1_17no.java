package array;

import java.util.Scanner;

/*17.	WAP to replace all the 0’s with 1’s in your array.
Your array is [26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34].*/

public class Replace_0_to_1_17no {
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
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("After repalce all 0 to 1");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				arr[i]=1;
			}
			System.out.println(arr[i]);
		}
	
		
	}

}
