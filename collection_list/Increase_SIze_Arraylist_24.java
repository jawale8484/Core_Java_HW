package collection_list;
import java.util.*;
//24.	WAP to increase the size of an ArrayList
public class Increase_SIze_Arraylist_24 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		for (int i = 11; i <=21; i++) {
			list.add(i);
		}
		System.out.println(list);
	}
}				//by default size of list is 10
				//when we add 11 elements the size is increase by using formula
				//	then the size of array list is 16....and so on			
