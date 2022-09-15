package Day7;
import java.util.Iterator;
import java.util.Stack;
public class Stac {
	public static void main(String args[])
	{
		Stack<String> v = new Stack<>();
		v.add("UST");
		v.add("TCS");
		v.add("CTS");
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
