package collection_list;

import java.util.*;

//20.	WAP to join two ArrayLists
public class Join_ArrayList_20 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		for (int i = 11; i <= 15; i++) {
			list1.add(i);
		}
		System.out.println("First Arraylist-");
		System.out.println(list1);
		ArrayList list2 = new ArrayList();
		for (int i = 21; i <= 25; i++) {
			list2.add(i);
		}
		System.out.println("second Arraylist-");
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);
	}
}
