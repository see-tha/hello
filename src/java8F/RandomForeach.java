package java8F;
import java.util.Random;

public class RandomForeach {

	public static void main(String[] args) {
		Random random = new Random();
		random.ints().limit(5).forEach(System.out::println);

	}

}
