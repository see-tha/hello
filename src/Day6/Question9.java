package Day6;

import java.util.LinkedList;

public class Question9 {
   public static void main(String[] args) {
	   
      LinkedList<String> obj = new LinkedList<String>();
      
      obj.add("seetha");
      obj.add("UST");
      obj.add("TVM");
      obj.add("Kochi");
      obj.add("Banglore");
      obj.add("Alappuzha");
      
      System.out.println("orginal Linked List" +obj);
      
      LinkedList<String> newobj = new LinkedList<String>();
      newobj.add("xxx");
      newobj.add("yyy");
      
      obj.addAll(2,newobj);
      
      
         System.out.println("New LinkedList" +obj);
      }
      
      
  

}
