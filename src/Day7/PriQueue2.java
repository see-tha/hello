package Day7;

import java.util.PriorityQueue;

public class PriQueue2 {
	public static void main(String args[])
	{
		PriorityQueue<String> t = new PriorityQueue<>();
		t.add("Green");
		t.add("Red");
		t.add("Blue");
		t.add("Purple");
		t.add("White");
		System.out.println("First priority Queue;"+t);
		
		t.add("Black");
		System.out.println("New Queue:"+t);
		
		
		
	}
}
