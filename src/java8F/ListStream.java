package java8F;
import java.util.Random;

public class ListStream {
	 public static void main(String[] args) {
	        Random r =new Random();
	        r.ints().limit(5).forEach(System.out::println);



	   }

}
