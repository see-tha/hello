package recap;
import java.util.Scanner;
public class RQ12 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scan.nextInt();
        if(a>0)
            System.out.println(a+" is positive");
        else if(a<0)
            System.out.println(a+" is negative");
        else
            System.out.println(a+" is zero");
    }

}
