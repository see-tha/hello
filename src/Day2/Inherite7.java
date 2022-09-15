package Day2;

class Area{
	int c;
	public void rect(int a , int b)
	{
		c=a*b;
		System.out.println("rectangle area is:" +c);
		
	}
	public void rect(int a)
	{
		c=a*a;
		System.out.println("area of square is:" +c);
	}
}

public class Inherite7 {
	public static void main(String args[])
	{
		Area ar = new Area();
		ar.rect(5);
		ar.rect(2,4);
		
	}

}
