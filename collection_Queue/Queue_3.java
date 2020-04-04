package collection_Queue;

import java.util.*;
import java.lang.*;

//3.	WAP to create a Queue with user defined class objects amp.
class amp {
	int id;
	String name;

	public amp(int id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		return "amp [id=" + id + ", name=" + name + "]";
	}
}

public class Queue_3 {
	public static void main(String[] args) {
	
		amp ob=new amp(101, "java");
		Queue q = new PriorityQueue();
		
//		q.offer(ob.id);
//		q.add(ob.name);
//		System.out.println(q);
//		
		q.add(new amp(103,"sopil"));
//		q.offer(ob);
//		q.offer(new amp(102,"Nanu"));
//		
		
//		Iterator itr=q.iterator();
//		while(itr.hasNext()) {
//			 //System.out.println(itr.next());
//		}
		System.out.println(q);
	}

}
