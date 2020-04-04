package collection_list;
import java.util.*;
//37.	WAP to reverse elements in an ArrayList
public class Reverse_Arraylist_37 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		for (int i = 10; i <=15; i++) {
			list.add(i);
		}
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("In revrese order");
		System.out.println(list);
	}
}
