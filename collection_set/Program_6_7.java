package collection_set;
import java.util.*;
//6.	WAP to get the number of elements in a HashSet.
//7.	WAP to get the first and last elements in a TreeSet.
//8.	WAP to get the number of elements in a TreeSet.

public class Program_6_7 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(11);
		hs.add(22);
		hs.add(33);
		hs.add(44);
		System.out.println("HashSet get the number of elements");
		System.out.println(hs);
		
		
		TreeSet ts=new TreeSet();
		System.out.println("\n TreeSet get number of elemnts");
		ts.add(66);
		ts.add(44);
		ts.add(88);
		ts.add(11);
		System.out.println(ts);
	
		System.out.println("Get First Elments-"+ts.first());
		System.out.println("Get last Elements-"+ts.last());
	}

}
