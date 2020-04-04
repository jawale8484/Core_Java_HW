package collection_set;
import java.util.*;
//1.	WAP to iterate through all elements in a TreeSet.
public class TreeSet_iterator_1 {
	public static void main(String[] args) {
		TreeSet ts =new TreeSet();
		ts.add(45);
		ts.add(66);
		ts.add(22);
		ts.add(11);
		Iterator itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
