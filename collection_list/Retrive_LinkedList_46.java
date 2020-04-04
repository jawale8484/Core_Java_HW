package collection_list;

import java.util.*;

//46.	WAP to retrieve but does not remove, the first element of a linked list.
//47.	WAP to retrieve but does not remove, the last element of a linked list.
public class Retrive_LinkedList_46 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(11);
		list.add(12);
		list.add(13);
		System.out.println(list);

		System.out.println(list.peekFirst()); // first
		System.out.println(list.peekLast()); // second
	}
}
