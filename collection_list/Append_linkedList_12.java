package collection_list;

import java.util.*;

//12.	WAP to append the specified element to the end of a linked list.
public class Append_linkedList_12 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		for (int i = 11; i < 15; i++) {
			list.add(i);
		}
		System.out.println(list);
		list.addLast(15);
		System.out.println("append the specified element to the end of a linked list");
		System.out.println(list);
	}
}
