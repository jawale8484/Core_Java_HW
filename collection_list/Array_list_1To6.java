package collection_list;

import java.util.*;

public class Array_list_1To6 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//add in arraylist
		list.add(10);
		list.add(15);
		list.add("hello");
		list.add("java");
		System.out.println(list);
		
		//remove in arraylist
		list.remove(1);
		System.out.println(list);
		
		//check is empty or not
		System.out.println(list.isEmpty());
		
		//check elements are presents in array list
		System.out.println(list.contains("java"));
		
		//insert an elements in first position
		list.add(0, "programming");
		System.out.println(list);
		
		//clear all object 
		list.clear();
		System.out.println(list);
		
		//
	}

}
