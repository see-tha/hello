package hello;
import java.util.Scanner;
public class Smallest {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter first number");
		x=sc.nextInt();
		System.out.println("EnterSecond number");
		y=sc.nextInt();
		System.out.println("Enter Third number");
		z=sc.nextInt();
	if(x<y && x<z)
	{
		System.out.println("First Number is smallest");
	
	}
	else if(y<z) {
		System.out.println("Second Number is smallest");
		
	}
	else
	{
		System.out.println("Third Number is smallest");
	}
	}

}
