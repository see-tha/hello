package Day4;

public class Q3 {
	public static void main(String args[])
	{
		int[] array = new int[] {2,4,6};
		int sum=0;
		int pro=1;
		for(int i =0; i<array.length; i++)
		{
			sum= sum+array[i];
			pro=pro*array[i];
			
			
		}
		System.out.println("Sum of array:" +sum);
		System.out.println("Product of array" +pro);
	

}
}
