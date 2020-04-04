package collection_list;
import java.util.*;
//17.	WAP to sort a given ArrayList
public class Sort_ArrayList_17 {
	public static void main(String[] args) {
		
		ArrayList list =new ArrayList();
		list.add(15);
		list.add(10);
		list.add(12);
		list.add(25);
		list.add(5);
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After sort...");
		System.out.println(list);
	}
}
