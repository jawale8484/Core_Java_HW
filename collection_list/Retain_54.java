package collection_list;
import java.util.*;
//54.	WAP to retain all elements from ArrayList
public class Retain_54 {
	public static void main(String[] args) {
	ArrayList list =new ArrayList();
	list.add(11);
	list.add(22);
	list.add(66);
	System.out.println(list);
	
	ArrayList list2 =new ArrayList();
	list2.add(11);
	list2.add(22);
	list2.add(5);
	
	  //retains only those elements in the First arraylist which are present
	  //in second arraylist  
	System.out.println(list.retainAll(list2));
	System.out.println(list);
	}
}
