package collection_list;

import java.util.*;

//26.	WAP to remove the third element from an ArrayList
public class Remove_26 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		System.out.println(list);
		System.out.println("After remove third elemnts...");
		list.remove(2);
		System.out.println(list);
	}
}
