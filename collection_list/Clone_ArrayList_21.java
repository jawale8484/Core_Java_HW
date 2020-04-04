package collection_list;

import java.util.*;

//21.	WAP to clone an ArrayList to another ArrayList
public class Clone_ArrayList_21 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		for (int i = 11; i <= 15; i++) {
			list1.add(i);
		}
		list1.clone();
		System.out.println("First arraylist..");
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList();
		list2=(ArrayList) list1.clone();
		System.out.println("clone an ArrayList to another ArrayList");
		System.out.println(list2);
	}
}
