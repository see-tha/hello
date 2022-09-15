package Day2;

class I{
	int u;
	public void printNum()
	{
		System.out.println(u);
	}
}
class J extends I{
	int j;
	public void printNum()
	{
		System.out.println(j);
	}
}


public class Inheritance10 {
	public static void main(String args[])
	{
		J a=new J();
		a.u=10;
		a.j=8;
		a.j=a.u;
		a.printNum();
		
	}

}
