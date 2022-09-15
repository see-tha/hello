package Day6;

import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
public class Question6 {
   public static void main(String[] args) {
	   
      LinkedList<String> obj = new LinkedList<String>();
      
      obj.add("seetha");
      obj.add("UST");
      obj.add("TVM");
      obj.add("Kochi");
      obj.add("Banglore");
      obj.addFirst("kottayam");
      obj.addLast("Kozhikode");
      ListIterator itr = obj.listIterator();
      //Collections.reverse(obj);
      
      while (itr.hasNext()) {
         System.out.println(itr.next());
      }
      
      
   }
}