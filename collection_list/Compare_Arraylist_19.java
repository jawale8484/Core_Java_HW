package collection_list;

import java.util.*;

//19.	WAP to compare two ArrayLists print if equal?
public class Compare_Arraylist_19 {
	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		for (int i = 11; i <=15; i++) {
			list1.add(i);
		}
		System.out.println("First Arraylist-");
		System.out.println(list1);
		ArrayList list2=new ArrayList();
		for (int i = 11; i <=15; i++) {
			list2.add(i);
		}
		System.out.println("second Arraylist-");
		
		System.out.println(list2);
		System.out.println(list2.containsAll(list1));
		
		if(list2.containsAll(list1)) {
			System.out.println("if is true-");
			System.out.println(list1);
		}
	}
	
}
