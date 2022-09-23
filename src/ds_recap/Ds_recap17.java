package ds_recap;
import java.util.*;
public class Ds_recap17 {
	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<Integer>();
		Integer arr1[] = {1,4,7,8,3};
		s1.addAll(Arrays.asList(arr1));
		Set<Integer> s2 = new HashSet<Integer>();
		Integer arr2[] = {1,9,7,10,3,11,19};
		s2.addAll(Arrays.asList(arr2));
		Set<Integer> compare = new HashSet<Integer>(s1);
		compare.retainAll(s2);
		System.out.println(compare);
		
		

	}

}
