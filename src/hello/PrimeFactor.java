package hello;
import java.util.*;
public class PrimeFactor {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		for(int i=2; i<=num;i++)
		{
			while(num%i==0)
			{
				System.out.println(i + "");
				num=num/i;
			}
		}
			
		
		
		

	}

}
