package mock_exam;
import java.util.*;

public class Name_string {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name:" );
		String f = sc.nextLine();
		
		System.out.println("enter the second name:" );
	String s = sc.nextLine();
		
		f=f.toUpperCase();
        f = f + " ";
        s=s.toUpperCase();
        String s3=f.concat(s);
        char[] cs=s3.toCharArray();
        for(char c:cs) {
            if(Character.isDigit(c)||c=='!'||c=='@'||c=='#'||c=='$'||c=='%') {
                System.out.println("invalid name");
                System.exit(0);
            }
            
    }
System.out.println(s3);
}
		
	}

		