package collection_list;

import java.util.*;

//49.	WAP to convert a linked list to array list.
public class Convert_linked_Array_49 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(12);
		list.add(33);
		list.add(44);
		System.out.println("Linked list"+list);
		ArrayList alist=new ArrayList();
		
		//convert linkedlist to arraylist
		alist.addAll(list);
		System.out.println("After conver in arraylist-"+alist);

		
	}
}
