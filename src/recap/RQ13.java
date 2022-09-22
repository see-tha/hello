package recap;
import java.util.Scanner;
public class RQ13 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		double x = Math.sqrt(number);
		
		if(x==(int)x)
		{
			System.out.println(+number+"is perfectsqaure");
		}
		else
		{
			System.out.println(+number+ "is not perfectsqaure");
		}
				
	}

}
