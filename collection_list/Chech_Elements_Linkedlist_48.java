package collection_list;

import java.util.*;

//48.	WAP to check if a particular element exists in a linked list.
public class Chech_Elements_Linkedlist_48 {
	public static void main(String[] args) {
	LinkedList list=new LinkedList();
	list.add(66);
	list.add(77);
	list.add(88);
	list.add(99);
	System.out.println(list);
	System.out.println(list.contains(77));
	}
}
