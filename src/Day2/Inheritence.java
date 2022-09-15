package Day2;

 class parent
{
	void pmethod()
	{
		System.out.println("This is the parent class");
	}
}
class cclass extends parent
{
	
	void pmethod()
	{
		System.out.println("This is the child class");
		
	}
}

public class Inheritence {
	public static void main(String args[])
	{
		parent p = new parent();
		cclass c = new cclass();
		p.pmethod();
		c.pmethod();
		c.pmethod();
		
	}
	

}
