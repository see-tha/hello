package mock_exam;
import java.util.*;


public class Fuel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter the quantity of petrol:");
		double x = sc.nextInt();
		if(x<1)
		{
			System.out.println(x+ "invalid");
			System.exit(0);
		}
		
		
		System.out.println("Enter the distance covered");
		float y = sc.nextInt();
		if(y<1)
		{
			System.out.println(y+"invalid");
			System.exit(0);
		}
		
		double cons = ((x/y)*100);
		
		System.out.println("Fuel consumption 100km:" +cons);
		
		double miles = (y*0.6214);
		double gallons = (x*0.2642);
		
		double z= (miles/gallons);
		
		System.out.println("miles/gallons"+z);
		
		
		
		
		
		

	}

}
