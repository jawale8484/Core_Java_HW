package collection_list;

//7.	WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)
import java.util.*;

public class Even_number_7 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList(50);
		for (int i = 1; i <= 50; i++) {
			list.add(i);

		}

		
		Iterator <Integer>itr=list.iterator();
		while(itr.hasNext()) {
			int num=itr.next();
			if(num%2==0) {
			System.out.print(num+" ");
			}
		}
		
		
	}

}
