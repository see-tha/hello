package Day6;

public class NullPointer2
{
	public static void main(String args[])
	{
		String s = null;
		try {
			System.out.println("First  element:" +s.charAt(0));
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception occurs");
		}
	}
}