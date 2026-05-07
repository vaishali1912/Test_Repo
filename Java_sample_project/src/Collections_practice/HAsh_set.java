package Collections_practice;
// elements store on the basis of hash code value
// does not follow insertion order
// single null allowed
// duplicate not allowed
import java.util.*;

public class HAsh_set {

	public static void main(String[] args) {
		
    Set<String> set=new HashSet<String>();
    set.add("Orange");
    set.add("MAngo");
    set.add("Kiwi");
    set.add("Apple");
    set.add("Apple");
    set.add(null);
    set.add(null);
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
