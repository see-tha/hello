package hello;

public class Ifelseif {
	public static void main(String args[])
	{
		int mark=45;
		if(mark>=40 && mark<50)
		{
			System.out.println("Grade B+");
		}
		else if(mark>=50 && mark<60)
		{
			System.out.println("Grade A");
		}
		else if(mark>=60 && mark<70)
		{
			System.out.println("Grade A+");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
