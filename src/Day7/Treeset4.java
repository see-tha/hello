package Day7;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset4 {
	public static void main(String args[])
	{
		TreeSet<String> t = new TreeSet<>();
		t.add("Green");
		t.add("Red");
		t.add("Blue");
		t.add("White");
		System.out.println("Orginal Treeset:"+t);
		System.out.println("First element is:" +t.first());
		System.out.println("Last element is:" +t.last());
			
	}

}
