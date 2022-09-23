package ds_recap;
import java.util.*;
public class Ds_recap12 {
	public static void main(String args[])
	{
        
        LinkedList<String> l = new LinkedList<String>();
        
        l.add("ram");
        l.add("shyam");
        l.add("gyan");
        l.add("dhyan");
        l.add("vyan");
        
        System.out.println("The elements of LinkedList are: "+l);
        
       LinkedList<String> clone = (LinkedList<String>)l.clone();
       System.out.println("Cloned LinkedList: " + clone);
    }

}
