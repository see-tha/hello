package java8F;

import java.util.Random;

public class Sort_Random {

	public static void main(String[] args) {
		Random random = new Random();
		random.ints().limit(5).sorted().forEach(System.out::println);

	}

}
