package collection_list;

import java.util.*;

public class Remove_LinkedList_33_35 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("SWapnil");
		list.add("nanu");
		list.add("pavan");
		list.add("vaibhav");
		list.add("Patil");
		list.add("baby");
		System.out.println(list);
		System.out.println("...remove at specified position elemets.....");
		list.remove(2);
		System.out.println(list);
		list.removeFirst();
		System.out.println("Remove first-"+list);
		list.removeLast();
		System.out.println("Remove last-"+list);
		list.removeAll(list);
		System.out.println("All remove"+list);
	}
}
