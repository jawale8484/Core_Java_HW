package collection_list;
import java.util.*;
//8.	WAP to match two collections
public class Match_collection_8 {
	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add(10);
		list1.add(15);
		System.out.println("Colection first-"+list1);
		ArrayList list2=new ArrayList();
		list2.add(10);
		list2.add(15);
		System.out.println("Colection second-"+list2);
		System.out.println("match two collections-");
		System.out.println(list1.containsAll(list2));
		
		
		}
}
