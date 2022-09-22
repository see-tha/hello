package java8F;
import java.util.*;

public class Sum_List {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(12);
		list.add(10);
		list.add(5);
		int sum = list.stream().mapToInt(i->i.intValue()).sum();
		System.out.println("The sum of arrayList is:" +sum);
		
		
		

	}

}
