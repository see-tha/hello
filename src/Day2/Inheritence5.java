package Day2;

class printnumbers
{
	public int print(int a)
	{
		System.out.println(a);
		return a;
	}
	public float print(float b)
	{
		System.out.println(b);
		return b;
	}
	public double print(double c)
	{
		System.out.println(c);
		return c;
	}
	
	
}


public class Inheritence5 {

	public static void main(String[] args) {
		printnumbers pm =new printnumbers();
		
		pm.print(9);
		pm.print(0);
		pm.print(6.88);

	}

}
