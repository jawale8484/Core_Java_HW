package collection_set;
import java.util.*;
//10.	WAP to remove a given element from a TreeSet.
public class TreeSet_Remove_10 {
	public static void main(String[] args) {
		TreeSet ts =new TreeSet();
		ts.add("My");
		ts.add("name");
		ts.add("is");
		ts.add("java");
		System.out.println(ts);
		System.out.println("Remove a given elments in TreeSet");
		ts.remove("is");
		System.out.println(ts);
	}
}
