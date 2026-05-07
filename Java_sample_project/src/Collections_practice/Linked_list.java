package Collections_practice;

import java.util.LinkedList;
import java.util.List;

public class Linked_list {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		
		LinkedList<String> l=new LinkedList<String>();
		list.add("MAngo");
		list.add("Banana");
		list.add("Orange");
		list.add("Orange");
		list.add("Orange");
		list.add(null);
		list.add(null);
		System.out.println(list);
		System.out.println(list.get(1));

	}

}
