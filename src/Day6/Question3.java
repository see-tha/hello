package Day6;

import java.util.ListIterator;
import java.util.LinkedList;
public class Question3 {
   public static void main(String[] args) {
	   
      LinkedList<String> obj = new LinkedList<String>();
      
      obj.add("seetha");
      obj.add("UST");
      obj.add("TVM");
      obj.add("Kochi");
      obj.add("Banglore");
      ListIterator itr = obj.listIterator(3);
      System.out.println("Iteration through the elements: ");
      while (itr.hasNext()) {
         System.out.println(itr.next());
      }
      
      
   }
}
