package recap;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		int n,temp;
		
		int p=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check");
		n = sc.nextInt();
		temp=n;
		
		while(n!=0)
		{
			int rem = n%10;
			p=(p) + (rem*rem*rem);
			n=n/10;
		}
		if(temp==p)
		{
			System.out.println("Yes the number is armstrong");
		}
		else
		{
			System.out.println("Not armstrong");
		}

	}

}
