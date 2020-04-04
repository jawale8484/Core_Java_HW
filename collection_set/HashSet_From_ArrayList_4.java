package collection_set;

import java.util.*;

//4.	WAP to create a HashSet from an ArrayList
public class HashSet_From_ArrayList_4{
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(55);
		hs.add(33);
		hs.add(11);
		hs.add(2);
		
		Iterator itr=hs.iterator();
		System.out.println("Hashset");
		System.out.println(hs);
		
		System.out.println("Convert Hashste into ArrayList");
		ArrayList list=new ArrayList(hs);
		System.out.println(list);
		
		
	}
}
