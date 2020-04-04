package collection_Map;
import java.util.*;
//5.	WAP to get all keys from the given a TreeMap
public class TreeMap_5 {
	public static void main(String[] args) {
		TreeMap <Integer, String>ts=new TreeMap<Integer, String>();
		ts.put(11, "java");
		ts.put(12, "OS");
		ts.put(13, "DBMS");
		System.out.println("All keys from the given a TreeMap");
		for(Map.Entry<Integer, String> m:ts.entrySet()) {
			System.out.println(m.getKey());
		}
	}
}
