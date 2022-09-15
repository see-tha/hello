package Day5;

public class NullException {

	public static void main(String[] args) {
		String a= null;
		try
		{
			if(a.equals("gfg"))
				System.out.println("Same");
			else
				System.out.println("Not same");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException Found");
		}
		

	}

}
