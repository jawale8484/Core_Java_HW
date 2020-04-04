package collection_list;

import java.util.*;

//45.	WAP to remove and return the first element of a linked list.
public class Remove_Retrive_linkedlist_45 {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(55);
		list.add(22);
		list.add(66);
		System.out.println(list);
		
		System.out.println("Return First-"+list.get(0));
		
		list.removeFirst();
		System.out.println("REmove first-"+list);
	}
}
