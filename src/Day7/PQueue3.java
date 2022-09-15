package Day7;

import java.util.PriorityQueue;

public class PQueue3 {
	public static void main(String args[])
	{
		PriorityQueue<String> t = new PriorityQueue<>();
		t.add("Green");
		t.add("Red");
		t.add("Blue");
		t.add("Purple");
		t.add("White");
		System.out.println("First priority Queue;"+t);
		
		
		System.out.println("Number of elements in Queue:"+t.size());
		
	}
}


