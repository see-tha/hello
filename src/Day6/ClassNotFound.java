package Day6;

public class ClassNotFound {
	public static void main(String args[])
	{
		try
		{
			Class.forName("No Class Exist");
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
