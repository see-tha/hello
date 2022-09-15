package Day7;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset3 {
	public static void main(String args[])
	{
		TreeSet<String> t = new TreeSet<>();
		t.add("Green");
		t.add("Red");
		t.add("Blue");
		t.add("White");
		Iterator itr = t.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}

