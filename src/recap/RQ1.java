package recap;
import java.util.*;

public class RQ1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age:");
		int age = sc.nextInt();
		System.out.println("Enter sex:M/F");
		int sex = sc.next().charAt(0);
		
		System.out.println("Are You married? Y/N");
		int marr = sc.next().charAt(0);
		
		if(sex=='F') {
			System.out.println("only work in urban areas");
			
		}
		if(sex=='M')
		{
			if(age>=20 && age<=40)
			{
				System.out.println("he can work anywhere");
			}
			else if((age >= 40) && (age < 60)) {
				System.out.println("You will work only in urban areas");
			}
			else {
				System.out.println("Not Working");
			}
		}
		
	}

}
