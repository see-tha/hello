package Day4;
import java.io.File;
import java.util.*;
import java.io.FileWriter;
public class FileQuest2 {
	public static void main(String args)
	{
		try {
			FileWriter myWriter = new FileWriter("example.txt");
			
			myWriter.write("Hello!");
			myWriter.write("Welcome!!");
			myWriter.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
