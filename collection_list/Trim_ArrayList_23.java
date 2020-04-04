package collection_list;
import java.util.*;
//23.	WAP to trim the capacity of an ArrayList the current list size
public class Trim_ArrayList_23 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(12);
		list.add("love");
		System.out.println(list);
		list.trimToSize(); 		 //trim is used the unused memory in array list
		System.out.println(list);
		

	}

}
