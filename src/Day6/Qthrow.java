package Day6;


class MyException extends Exception
{
	
}

public class Qthrow {

	public static void main(String[] args) {
		try
		{
			throw new MyException();
		}
		catch(MyException e)
		{
			System.out.println("xxx");
			System.out.println(e);
		}
		

	}

}
