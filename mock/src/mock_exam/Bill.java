package mock_exam;
import java.util.*;

public class Bill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("Enter the no of pizzas bought: ");
		int pi = sc.nextInt();
		
		System.out.println("Enter the no of puffs bought: ");
		int pu = sc.nextInt();
		
		System.out.println("Enter the no of cool drinks bought: ");
		int co = sc.nextInt();
		
		
		int x = pi*100;
		int y = pu*20;
		int z = co*10;
		
		
		int total = x+y+z;
		System.out.println("BILL DETAILS");
		System.out.println("No of pizzas: "+pi);
		System.out.println("No of puffs: "+pu);
		System.out.println("No of cooldrinks: "+co);
		
		System.out.println("Total Prize: " +total);
		System.out.println("ENJOY THE SHOW!!!!");
		

	}

}
