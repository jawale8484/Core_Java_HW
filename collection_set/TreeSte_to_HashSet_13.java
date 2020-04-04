package collection_set;
import java.util.*;
//13.	WAP to create a TreeSet from a HashSet.
public class TreeSte_to_HashSet_13 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add("vaibhav");
		ts.add("nehal");
		ts.add("sopil");
		System.out.println("TreeSet---");
		System.out.println(ts);
		
		HashSet hs=new HashSet();
		hs.add("java");
		
		hs.addAll(ts);
		System.out.println("\n Convert TreeSet into HashSet---");
		System.out.println(hs);
		
		
//		14.	WAP to create a new TreeSet, add Strings and print the TreeSet.
		
		TreeSet t=new TreeSet();
		t.add("vaibhav");
		t.add("jawale");
		System.out.println();
		System.out.println("In TreeSet Add String and Print the TreeSet");
		System.out.println(t);
		
		
	}
}
