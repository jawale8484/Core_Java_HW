package collection_Map;
import java.util.*;
//6.	WAP to get only the Keys from a HashMap

//7.	WAP to get only the Values from a HashMap


//8.	WAP to delete all elements from a given TreeMap

//9.	WAP to copy a TreeMap content to another TreeMap


public class HashMap_6 {
	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(11, "Ashu");
		hs.put(12, "Ok");
		hs.put(13, "Nehal");
		
		System.out.println("Get only the Keys from a HashMap");
		
		for(Map.Entry<Integer, String> m:hs.entrySet()) {
			System.out.println(m.getKey());
		}
		System.out.println("Get only the Values from a HashMap\r\n" + 
				"");
		for(Map.Entry<Integer, String> m1:hs.entrySet()) {
			System.out.println(m1.getValue());
		}
		
		System.out.println("\n TreeMap------");
		TreeMap<Integer,String> ts=new TreeMap<Integer,String>();
		ts.put(1, "aaa");
		ts.put(2, "bbb");
		ts.put(3,"ccc");
		
		for(Map.Entry<Integer,String> mm:ts.entrySet()) {
			System.out.println(mm.getKey()+" "+mm.getValue());
		}
		System.out.println("Coppy a TreeMap content to another TreeMap");
		TreeMap<Integer,String> ts1=new TreeMap<Integer,String>();
		ts1.putAll(ts);
		for(Map.Entry<Integer,String> mm:ts1.entrySet()) {
			System.out.println(mm.getKey()+" "+mm.getValue());
		}
		
		hs.clear();
		System.out.println("\n Deleted all elements from a given TreeMap");
		System.out.println(hs);
	}
}
