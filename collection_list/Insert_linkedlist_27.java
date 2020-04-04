package collection_list;

import java.util.*;

//27.	WAP to insert elements into the linked list at the first and last position.
public class Insert_linkedlist_27 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("is");
		list.add("programming");
		System.out.println("Befor...");
		System.out.println(list);
		list.addFirst("java");
		list.addLast("langauge");
		System.out.println("After...adding first and last elements");
		System.out.println(list);
		
	}
}
