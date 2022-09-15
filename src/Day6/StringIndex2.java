package Day6;

public class StringIndex2 {
	public static void main(String args[])
	{
		try
		{
			String s =" Seetha";
			char c= s.charAt(8);
			System.out.println(c);
			
			
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bound Exception");
		}
	}

}
