package Day4;

abstract class Parent{
	public abstract void message();
}

class sub1 extends Parent
{
	public void message()
	{
		System.out.println("This is first class");
	}
}
class sub2 extends Parent
{
	public void message()
	{
		System.out.println("This is second class");
	}
}




public class Q6 {
	public static void main(String args[])
	{
		sub1 s1 = new sub1();
		s1.message();
		sub2 s2 = new sub2();
		s2.message();
		
	}

}
