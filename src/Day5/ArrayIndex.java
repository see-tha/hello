package Day5;

public class ArrayIndex {

	public static void main(String[] args) {
		try
		{
			int ar[] = new int[4];
			System.out.println(ar[8]);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occured");
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Exception occured");
		}
		catch(Exception e)
		{
			
		}
		System.out.println("rest of the code");
	}

}
