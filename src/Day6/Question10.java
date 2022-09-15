package Day6;


import java.util.LinkedList;


public class Question10 {
   public static void main(String[] args) {
	   
      LinkedList<String> obj = new LinkedList<String>();
      
      obj.add("seetha");
      obj.add("UST");
      obj.add("TVM");
      obj.add("Kochi");
      obj.add("Banglore");
      obj.add(2,"Alappuzha");
      
      System.out.println("Orginal list" +obj);
      //object first_element = obj.getFirst();
      System.out.println("First Element is : "
              + obj.getFirst());
      
      System.out.println("Last Element is : "
              + obj.getLast());
      
      
      
      
      
      
      
      
   }
}
