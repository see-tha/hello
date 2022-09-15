package Thread;

class MyThread implements Runnable
{
	String message;
	MyThread(String msg)
	{
		message = msg;
	}
	public void run()
	{
		for(int count=0;count<=5;count++)
		{
			try
			{
				System.out.println("Run method: "  +message);
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				System.out.println("Exception in thread" +ie.getMessage());
			}
		}
	}
}

public class MainThread {

	public static void main(String[] args) {
		MyThread obj1 = new MyThread(" Mythread1 obj");
		MyThread obj2= new MyThread("Mythread obj2");
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		

	}

}
