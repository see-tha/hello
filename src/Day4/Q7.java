package Day4;

abstract class Animal{
	abstract void cats();
	abstract void dogs();
	
}

class cats extends Animal
{
	public void cats() {
	System.out.println("Cats  Meow");
}
	
	
}
class dogs extends Animal
{

	void dogs() {
		System.out.println("Dogs Bark");
	}
}



public class Q7 {
	public static void main(String args[])
	{
		cats c = new cats();
		dogs d = new dogs();
		c.cats();
		d.dogs();
	}




	
}
