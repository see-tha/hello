package ds_recap;
import java.util.*;
public class Ds_recap19 {
	public static void main(String[] args) {
		
		Set<Integer> treeset1 = new TreeSet<Integer>();
		Integer[] n1 = {1,6,2,5,8,10};
		treeset1.addAll(Arrays.asList(n1));
		Set<Integer> treeset2 = new TreeSet<Integer>();
		Integer[] n2 = {1,6,2,5,8,10};
		treeset2.addAll(Arrays.asList(n2));
		/*Set<Integer> compare = new TreeSet<Integer>(treeset1);
		compare.retainAll(treeset2);
		System.out.println(compare);*/
		if(treeset1.equals(treeset2))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		
		
		
		
		
	}

}
