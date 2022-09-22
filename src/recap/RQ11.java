package recap;
import java.util.Scanner;
public class RQ11 {
	public static void main(String args[])
	{
	 int temp,smallest;
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the first number:");
     int a = scan.nextInt();
     System.out.println("Enter the second number:");
     int b = scan.nextInt();
     System.out.println("Enter the third number:");
     int c = scan.nextInt();
     temp=a<b?a:b;
     smallest = c<temp?c:temp;
     System.out.println(smallest+" is the smallest number");



}

}
