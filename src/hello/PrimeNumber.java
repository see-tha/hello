package hello;

public class PrimeNumber {

	public static void main(String[] args) {
		int i=0;
		int num=0;
		String PrimeNumbers="";
		for(i=0;i<=100; i++)
		{
			int counter=0;
			for(num=i; num>=1; num--)
			{
				if(i%num==0) {
					counter=counter+1;
					
				}
					
				
			}
			if(counter==2)
			{
				PrimeNumbers= PrimeNumbers+i + " ";
			}
		}
		System.out.println("Prime numbers upto 100:");
		System.out.println(PrimeNumbers);

		System.out.println();
	}
	

}
