package recap;
import java.util.Scanner;
public class RQ8 {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number(a):");
        int a = scan.nextInt();
        System.out.println("Enter the second number(b):");
        int b= scan.nextInt();
        System.out.println("After Swapping");
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a:"+a+" b:"+b);
    }



}


