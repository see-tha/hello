package hello;
import java.util.Scanner;
public class Numbers {
	public static void main(String args[])
	{
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		x=sc.nextInt();
		System.out.println("Enter Second number");
		y=sc.nextInt();
	if(x>y) {
		System.out.println("First Number is greatest");
	}
	else {
		System.out.println("Second Number is greatest");
	}
	}

}
