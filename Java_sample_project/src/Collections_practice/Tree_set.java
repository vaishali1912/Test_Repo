package Collections_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
//elements store on the basis of hash code value
// follow ascending order
//single null not allowed
//duplicate not allowed
public class Tree_set {

	public static void main(String[] args) {
		
	    Set<String> set=new TreeSet<String>();
	    set.add("Orange");
	    set.add("MAngo");
	    set.add("Kiwi");
	    set.add("Apple");
	    set.add("Apple");
//	    set.add(null);
//	    set.add(null);
	    System.out.println(set);
	    System.out.println(set.equals("Orange"));// false
	    set.remove("Kiwi");
	    System.out.println(set);
	   // System.out.println();
	    Iterator<String> itr=set.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	}

}
