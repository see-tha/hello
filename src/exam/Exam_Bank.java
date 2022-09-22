package exam;

	class Bank
	{
	    public void getBalance()
	    {
	        System.out.println("0");
	    }
	}
	class Bank_A extends Bank
	{
	    public void getBalance()
	    {
	        System.out.println("Balance is $100");
	    }
	}
	class Bank_B extends Bank
	{
	    public void getBalance()
	    {
	        System.out.println("Balance is $150");
	    }
	}
	class Bank_C extends Bank
	{
	    public void getBalance()
	    {
	        System.out.println("Balance is $200");
	    
	}
	}
	public class Exam_Bank {
	    public static void main (String[] args)
	    {
	        Bank_A ba=new Bank_A();
	        Bank_B bb=new Bank_B();
	        Bank_C bc=new Bank_C();
	        ba.getBalance();
	        bb.getBalance();
	        bc.getBalance();
	    }

	}
	
	
	


