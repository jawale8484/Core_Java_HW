package collection_set;
//11.	WAP to empty a HashSet.
import java.util.*;
//12.	WAP to test if a HashSet is empty or not.

public class HashSet_11_12 {
	public static void main(String[] args) {
		HashSet hs =new HashSet();
		hs.add(45);
		hs.add(66);
		System.out.println(hs);
		hs.removeAll(hs);
		System.out.println("Empty HAshSet");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
	}
}
