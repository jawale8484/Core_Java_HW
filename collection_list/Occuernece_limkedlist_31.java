package collection_list;

import java.util.*;

//31.	WAP to get the first and last occurrence of the specified elements in a linked list.
public class Occuernece_limkedlist_31 {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(6);
		
		System.out.println(list);
		System.out.println("First occuernce of 1 is-"+list.indexOf(1));
		System.out.println("last occuerence of 1 is-"+list.lastIndexOf(1));
		
	}
}
