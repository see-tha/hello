package Day2;

class Degree
{
	public void getdegree()
	{
		System.out.println("I got a degree");
		
	}
}
class UnderGraduate extends Degree
{
	public void same()
	{
		System.out.println("I am undergraduate");
	}
}
class PostGraduate extends Degree
{
	public void same()
	{
		System.out.println("I am postgraduate");
	}
}
public class Inheritence8 {
	public static void main(String args[])
	{
		Degree dr = new Degree();
		UnderGraduate ug = new UnderGraduate();
		PostGraduate pg = new PostGraduate();
		pg.same();
		ug.same();
		
		
		
		
		
	}

}
