package Day6;

public class ArrayIndex2 {
	public static void main(String args[])
	{
		try
		{
			int num[] = new int[3];
			num[0]=8;
			num[1]=4;
			num[2]=9;
			System.out.println(num[8]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception");
		}
	}

}
