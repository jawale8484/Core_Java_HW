package collection_list;

import java.util.*;

//36.	WAP to shuffle elements in an ArrayList
public class Shuffle_Arryalist_36 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(12);
		list.add(22);
		list.add(55);
		list.add(66);
		list.add(44);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}
}
