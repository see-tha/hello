package exam;
import java.util.Scanner;
public class Sum_evenodd {
	public static void main(String args[])
	{
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the numbers");
	int n=sc.nextInt();
	int Esum=0;
	int Osum=0;
	
	while(n!=0)
	{
		int r = n%10;
		if(r%2==0)
		{
			Esum = Esum+r;
			
			
		}
		else
		{
			Osum = Osum+r;
			
			
		}
		n=n/10;
	}
	System.out.println("Even Number Sum: "+Esum);
	System.out.println("Odd Number Sum: "+Osum);
	
	
	}

}
