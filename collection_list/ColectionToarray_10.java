package collection_list;

import java.util.*;

//10.	WAP to convert collection into array
public class ColectionToarray_10 {
	public static void main(String[] args) {
		ArrayList <Integer>list = new ArrayList();
		list.add(10);
		list.add(11);
		list.add(13);
		Object arr2[]=list.toArray();
		for (int i = 0; i < arr2.length; i++) {
			
			System.out.println(arr2[i]);
		}
	
	}

}
