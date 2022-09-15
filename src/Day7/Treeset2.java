package Day7;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset2 {
	public static void main(String args[])
	{
		TreeSet<String> t = new TreeSet<>();
		t.add("Green");
		t.add("Red");
		t.add("Blue");
		t.add("White");
		Iterator itr = t.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
