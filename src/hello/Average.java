package hello;
import java.util.*;
public class Average {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int arr[] = new int[11];
		int sum=0; float average;
		System.out.println("Enter 10 numbers");
		for(int i=1; i<=10;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=1; j<=10; j++)
		{
			sum+=arr[j];
		}
		average=sum/10;
		System.out.println("Average of 10 numbers is:" +average);
		
		
	}

}
