package exam;

public class Swap_Exam {
	public static void main(String[] args) {
		int x=10;
		int y=12;
		System.out.println("Before swap x= "+x+" y= "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swap  x= "+x+ " y= "+y);

	}

}
