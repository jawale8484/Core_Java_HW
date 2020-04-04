package collection_list;
import java.util.*;
//25.	WAP to update specific array element by given element
public class Udate_ArrayList_25 {
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add(10);
		list.add(15);
		list.add("love");
		System.out.println("Beforl"+list);
		list.set(2, "java");
		System.out.println("After-"+list);
	}
}
