package Day7;

import java.util.HashSet;

public class HashSet2 {
	public static void main(String args[])
	{
		HashSet<Integer> t = new HashSet<>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		System.out.println("first Hashset:" +t);
		
		
		HashSet<Integer> th = new HashSet<>();
		th.add(10);
		th.add(12);
		th.add(1);
		th.add(3);
		System.out.println("second hashSet:" +th);
		t.retainAll(th);
		System.out.println("common elements set;" +t);
		
	}
}

	
