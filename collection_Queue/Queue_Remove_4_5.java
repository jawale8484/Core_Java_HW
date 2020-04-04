package collection_Queue;

import java.util.*;
//4.	WAP to remove an element from a queue
//5.	Use 2 different method calls to remove elements from a queue

public class Queue_Remove_4_5 {
	public static void main(String[] args) {
		Queue q = new PriorityQueue();
		q.add(55);
		q.offer(11);
		q.add(66);
		q.offer(44);
		q.offer(22);
		System.out.println("Elements in Quque");
		System.out.println(q);
		q.remove(66);
		System.out.println("\n After remove elements");
		System.out.println(q);
		System.out.println("\n Two different method calls to remove"
				+ " elements from a queue\r\n" + 
				"");
		System.out.println(q.removeAll(q));
		q.clear();
		System.out.println(q);
	}
}
