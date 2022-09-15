package Day4;
import java.io.*;

public class FileQuest4 {

	public static void main(String[] args) {
		File file = new File("example.txt");
		if(file.delete())
		{
			System.out.println("File deleted successfully");
		}
		else
		{
			System.out.println("Failed to delete");
		}
		

	}

}
