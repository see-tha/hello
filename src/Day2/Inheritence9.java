package Day2;

class Bank
{
	int getBalance()
	{
		return 0;
	}
}

class BankA extends Bank {
	int getBalance(int balance)
	{
		return balance;
		
	}
}
class BankB extends Bank {
	int getBalance(int balance)
	{
		return balance;
		
	}
}
class BankC extends Bank {
	int getBalance(int balance)
	{
		return balance;
		
	}
}



public class Inheritence9 {
	public static void main(String args[])
	{
		BankA ba = new BankA();
		BankB bb = new BankB();
		BankC bc = new BankC();
		
		System.out.println("$" +ba.getBalance(1000));
		System.out.println("$" +bb.getBalance(1500));
		System.out.println("$" +bc.getBalance(2000));
	}

}
