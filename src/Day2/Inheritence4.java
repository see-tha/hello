package Day2;

class Shape
{
	public void print()
	{
		System.out.println("This is the shape");
	}
}
class Rectangl extends Shape{
	public void print_rect()
	{
		System.out.println("this is rectangle");
	}
	
}
class Circle extends Shape
{
	public void print_circ()
	{
		System.out.println("this is circle");
		
	}
}

class square extends Rectangl
{
	public void print_sqr()
	{
		System.out.println("this is a square of rectangle");
	}
}

public class Inheritence4 {
	public static void main(String args[]) {
		square se = new square();
		se.print();
		se.print_rect();
	}

}
