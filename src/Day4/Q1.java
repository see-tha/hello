package Day4;
import java.util.*;
public class Q1 {
	public static void main(String args[])
	{
		int n;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of Elements:");
		n=sc.nextInt();
		int[] array = new int[11];
		System.out.println("Enter the elements");
		for(int i=0; i<n; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Elements are:");
		for(int i =0; i<n; i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
