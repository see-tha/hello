import java.util.Scanner;
public class Arithmetic {
	public static void main(String args[])
	{
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
System.out.println("Enter the operation");
c=sc.nextInt();
		switch(c)
		{
		case 1: 
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		
		case 4:
			System.out.println(a/b);
			break;
		
			default:
				System.out.println("invalid");
		
			
		}
		
	}

}
