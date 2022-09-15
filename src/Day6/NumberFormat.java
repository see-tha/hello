package Day6;

public class NumberFormat {

	private static final 
	String in = "345.99";
	public static void main(String[] args) {
		try
		{
			int s = Integer.parseInt(in);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format exception Occur");
		}
		
		

	}

}
