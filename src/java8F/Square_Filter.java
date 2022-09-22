package java8F;

import java.util.ArrayList;

import java.util.List;
import java.util.OptionalDouble;

public class Square_Filter {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(52);
		list.add(100);
		list.add(5);
		list.add(25);
		
		OptionalDouble av = list.stream().mapToInt(i->i*i).filter(n->(n>100)).average();
				System.out.println("The average of Numbers is:" +av);
		
		
		
		
		

	}

}
