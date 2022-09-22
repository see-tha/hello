package java8F;
import java.util.Comparator;
import java.util.stream.*;

public class Low_High {
	public static void main(String args[])
	{
		Integer highest = Stream.of(0,12,6,100).max(Comparator.comparing(Integer::valueOf)).get();
		Integer lowest = Stream.of(0,12,6,100).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("The highest number is: " + highest);
	    System.out.println("The lowest number is: " + lowest);
	}

}
