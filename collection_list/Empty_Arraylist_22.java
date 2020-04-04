package collection_list;

import java.util.*;

//22.	WAP to empty an ArrayList
public class Empty_Arraylist_22 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		for (int i = 5; i <= 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		list.removeAll(list);    //this method is used for delete all elemnts in arraylist
		System.out.println(list);

	}
}
