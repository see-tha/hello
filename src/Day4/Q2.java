package Day4;
import java.util.*;
public class Q2 {
	public static void main(String args[])
	{
		int num[] = new int[4];
		int i,s=0;
		int number;
		Scanner sc =new Scanner(System.in);
		
		for(i=0;i<4;i++)
		{
			num[i]=sc.nextInt();
		}
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the value");
		number=ss.nextInt();
		for(i=0;i<4;i++)
		{
			if(num[i]==number)
			{
				s=1;
			}
		}
			if(s==1)
			{
				System.out.println("found");
			}
			else
				System.out.println("not found");
		
		
		
	}

}
