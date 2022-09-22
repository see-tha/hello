package recap;

public class Swap1 {

	public static void main(String[] args) {
		int x=10;
		int y=12;
		System.out.println("before swap x="+x+" y="+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("after swap  x="+x+ " y="+y);

	}

}
