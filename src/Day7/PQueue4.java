package Day7;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQueue4 {
	public static void main(String args[])
	{
		PriorityQueue<String> t = new PriorityQueue<>();
		t.add("Green");
		t.add("Red");
		t.add("Blue");
		t.add("Purple");
		t.add("White");
		System.out.println("First priority Queue;"+t);
		
		PriorityQueue<String> th1 = new PriorityQueue<>();
		th1.add("UST");
		th1.add("Red");
		th1.add("Blue");
		th1.add("black");
		th1.add("Trivandrum");
		System.out.println("Second priority Queue;"+th1);
		for(String element:t)
		{
			System.out.println(th1.contains(element)? "yes" : "no");
		}
		
		
		
		
	}

}
