package Day4;

import java.io.File;
import java.util.*;

public class FileQuest3 {
	public static void main(String args[])
	{
		try {
			File myread = new File("example.txt");
			
			Scanner sc = new Scanner(myread);
			while(sc.hasNextLine())
			{
				String data = sc.nextLine();
				System.out.println(data);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}