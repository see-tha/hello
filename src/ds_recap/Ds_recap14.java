package ds_recap;
import java.util.*;
public class Ds_recap14 {
	public static void main (String[] args) {
       
       
        LinkedList<String> list = new LinkedList<String>();
  
        
        list.add("Geek");
        list.add("for");
        list.add("Geeks");
        list.add("2020");
        list.add("2021");
  
        
        System.out.println("LinkedList:\t" + list);
  
        
        System.out.println("The last element is removed:\t" + list.removeLast());
          
        
        System.out.println("Final LinkedList:\t" + list);
          
       
        System.out.println("The first element is removed:\t" + list.removeFirst());
  
        
        System.out.println("Final LinkedList:\t" + list);
    }
}


