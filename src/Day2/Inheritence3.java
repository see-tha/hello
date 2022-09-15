package Day2;

class Rectangle
{
	int length , breadth;
	public void area()
	{
		System.out.println("Area of rectangle:" +length*breadth);
		
		
	}
	public void perimeter()
	{
		System.out.println("perimeter of rectangle" + 2*(length*breadth));
	}





public class Inheritence3 {
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		r.area();
		r.perimeter();
	}
}

}
