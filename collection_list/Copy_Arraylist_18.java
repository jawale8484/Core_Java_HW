package collection_list;

import java.util.*;

//18.	WAP to copy one ArrayList into another
public class Copy_Arraylist_18 {
	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		for (int i = 0; i <=5; i++) {
			list1.add(i);
		}
		System.out.println("Arraylist first..");
		System.out.println(list1);
		ArrayList list2=new ArrayList();
		list2=list1;
		System.out.println("after coppy...");
		System.out.println("Arraylist second...");
		System.out.println(list2);
	}
}
