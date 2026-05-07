package Collections_practice;

import java.util.*;

public class Deq {

	public static void main(String[] args) {
		Deque<String> q=new ArrayDeque<String>();
		q.add("Dahod");
		q.add("Chennai");
		q.add("Ahemadabad");
		q.add("Mumbai");
		q.add("Pune");
		q.add("Bhopal");
		q.add("Ahemadabad");
		System.out.println(q);
		System.out.println(q.getFirst());
		System.out.println(q.getLast());
		
		System.out.println(q.peekFirst());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.pop());
		q.remove("Mumbai");
		System.out.println(q);
		System.out.println(q.reversed());
		q.clear();
		System.out.println(q);
		System.out.println(q.peekFirst());

	}

}
