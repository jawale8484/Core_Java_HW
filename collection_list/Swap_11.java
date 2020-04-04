package collection_list;

import java.util.*;

//11.	WAP of swap two elements in an ArrayList
public class Swap_11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList list=new  ArrayList();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		System.out.println(list);
		System.out.println("enter the 1st position you have to swap");
		int fst=sc.nextInt();
		System.out.println("enter the 1st position you have to swap");		
		int scnd=sc.nextInt();
	
		Collections.swap(list, fst, scnd);  //this method is used for Swap elements
		System.out.println("After Swapping...");
		System.out.println(list);
	}
}
