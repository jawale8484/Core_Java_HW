package collection_Map;

import java.util.*;
import java.util.TreeMap;

public class TreeMap_3_4 {
	public static void main(String[] args) {
		
//	3.	WAP to search a key in a TreeMap
	TreeMap<Integer,String> ts1=new TreeMap<Integer,String>();
	ts1.put(11, "Java");
	ts1.put(12,"python");
	ts1.put(13, "Cpp");
	System.out.println("\n search a key in a TreeMap");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter search a key in a TreeMap ");
	int key=sc.nextInt();
	System.out.println(ts1.containsKey(key));
	
	

//4.	WAP to search a value in a TreeMap
	System.out.println("\n Enter Value to search a value in a TreeMap\r\n");
	String s=sc.nextLine();
	System.out.println(ts1.containsValue(s));
	


	}
}
