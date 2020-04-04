package collection_list;

import java.util.*;

//14.	WAP to iterate through all elements in a
// linked list starting at the specified position.
public class Linkedlist_14 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ArrayList list=new ArrayList();
		for (int i = 20; i <= 25; i++) {
			list.add(i);
		}
		System.out.println(list);
		System.out.println("Eneter the position");
		int pos=sc.nextInt();
		for (int i = pos; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}
}
