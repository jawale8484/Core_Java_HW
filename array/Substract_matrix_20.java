package array;

import java.util.Scanner;

//20.	WAP to subtract two matrices.
public class Substract_matrix_20 {
	public static void main(String[] args) {
		int row=0,col=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row & coloumn size");
		 row=sc.nextInt();
		 col=sc.nextInt();
		
		int arr1[][]=new int[row][col];    //first array
		System.out.println("Enter elments in first array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr1[i][j]=sc.nextInt();
			}			
		}
		
		System.out.println(" elemnets in first array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	
		int arr2[][]=new int[row][col];  //second array....
		
		System.out.println("Enter elments in second array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr2[i][j]=sc.nextInt();
				
			}			
		}
		
		System.out.println("Elemnets in second array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		int arr3[][]=new int[row][col];   //Third array...
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr3[i][j]=arr1[i][j]-arr2[i][j];				
			}
		}
		
		System.out.println("Substraction array....");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
