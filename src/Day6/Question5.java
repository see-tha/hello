package Day6;

import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
public class Question5 {
   public static void main(String[] args) {
	   
      LinkedList<String> obj = new LinkedList<String>();
      
      obj.add("seetha");
      obj.add("UST");
      obj.add("TVM");
      obj.add("Kochi");
      obj.add("Banglore");
      obj.add(2,"Alappuzha");
      ListIterator itr = obj.listIterator();
      
      
      while (itr.hasNext()) {
         System.out.println(itr.next());
      }
      
      
   }
}
