package recap;
import java.util.Scanner;
public class RQ9 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int GCD=1;
        for(int i=1;i<=x && i<y;i++)
        {
            if(x%i==0 && y%i==0) {
                GCD=i;
                }
        }
        System.out.println("GCD of "+x+" and "+y+" is "+GCD);
    }

}
