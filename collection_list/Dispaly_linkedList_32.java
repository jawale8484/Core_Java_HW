package collection_list;
import java.util.*;
//32.	WAP to display the elements and their positions in a linked list.
public class Dispaly_linkedList_32 {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		for (int i = 1; i <=5; i++) {
			list.add(i);
		}
		list.add(11);
		list.add(12);
		System.out.println(list);
		
	}
}
