package Collections_practice;

import java.util.ArrayList;// only arraylist

import java.util.*;
// follows insertion order
// index based
// Multiple null allowed
// duplicate allowed

public class List_test {

	public static void main(String[] args) {
		int[] arr= {9,8};//fixed size//
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> l=new Vector<Integer>();
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(5);
		list1.add(4);
		list.add(9);
		list.add(0);
		list.add(8);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(8);
	//	list.add(80);
	System.out.println(list);//
	ListIterator<Integer> it=list.listIterator();
	Iterator<Integer> itr=list.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
//		

	}

}
// parent= class, child=class--> extends
//parent=interface, child=interface--> extends
// parent=interface, child=class--> implements
//parent =class ,child=interface
