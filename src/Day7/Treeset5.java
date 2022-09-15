package Day7;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset5 {
	public static void main(String args[]) {
		
	
	TreeSet<Integer>t = new TreeSet<>();
	TreeSet<Integer>a = new TreeSet<>();
	
	t.add(1);
	t.add(2);
	t.add(3);
	t.add(4);
	t.add(5);
	t.add(6);
	t.add(8);
	t.add(10);
	
	a=(TreeSet)t.headSet(7);
	Iterator itr = a.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	
	}
	
	
}
