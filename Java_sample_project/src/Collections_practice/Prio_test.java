package Collections_practice;

import java.util.*;

public class Prio_test {

	public static void main(String[] args) {
		Queue<String> q=new PriorityQueue<String>();
		q.add("Dahod");
		q.add("Chennai");
		q.add("Ahemadabad");
		q.add("Mumbai");
		q.add("Pune");
		q.add("Bhopal");
		q.add("Ahemadabad");
		
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.remove("Mumbai");
		System.out.println(q);
		System.out.println(q.offer("Alpha"));//
		
		System.out.println(q);
		System.out.println(q.peek());// retrieve
		System.out.println(q.poll());// retrieve and remove
		
	}

}

