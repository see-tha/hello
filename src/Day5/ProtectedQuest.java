package Day5;

class Xxx
{
	protected String name = "Seetha";
	protected String lname = "Lakshmi";
	protected int age = 23;
}

public class ProtectedQuest {
	public static void main(String args[])
	{
		Xxx ob = new Xxx();
		System.out.println("Name is :" + ob.name);
		System.out.println("Last name is:" + ob.lname);
		System.out.println("Age is:" + ob.age);
	}

}
