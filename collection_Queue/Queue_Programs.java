package collection_Queue;

import java.util.*;

//1.	WAP to create a Queue with Integer objects 

//2.	WAP to check the top element in a queue

public class Queue_Programs {
	public static void main(String[] args) {
		Queue <Integer>q = new PriorityQueue<Integer>();
		q.offer(11);
		q.add(55);
		q.offer(77);
		q.offer(33);
		System.out.println(q);
		
		
		//.elements method are used for get first elements
		System.out.println("Top element in a queue-");
		System.out.println(q.element());
		System.out.println();
	}
}
