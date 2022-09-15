package hello;
import java.util.*;
public class OddEven {
	public static void main(String args[])
	{
		int n, even=0, odd=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array:");
		n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements:");
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0; i<n; i++) {
			if(a[i]%2==0)
			{
				even=even+a[i];
			}
			else
			{
				odd=odd+a[i];
			}
		}
		System.out.println("Sum of even number"+even);
		System.out.println("Sum of odd numbers"+odd);
			
		
	}

}
