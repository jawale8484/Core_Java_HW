package collection_set;

import java.util.*;

//9.	WAP to create a reverse order view of the elements contained in a given TreeSet.
public class TreeSet_Revers_9 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new Mycomparator());
		ts.add(20);
		ts.add(40);
		ts.add(0);
		ts.add(90);
		ts.add(2);
		System.out.println("Using Comparator Reverse the TreeSet Elements");
		System.out.println(ts);

		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(20);
		ts1.add(0);
		ts1.add(60);
		ts1.add(90);
		ts1.add(3);
		ts1.add(1);
		ArrayList al = new ArrayList(ts1);
		Collections.reverse(al);
		System.out.println("By convering TreeSet into rrayList And  Using Collections Reverse method");
		System.out.println(al);

	}
}
