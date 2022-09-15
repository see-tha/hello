package Day7;


import java.util.*;
import java.util.Vector;

public class Vect {
	public static void main(String args[])
	{
		Vector<String> v = new Vector<>();
		v.add("UST");
		v.add("TCS");
		v.add("CST");
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	

}
