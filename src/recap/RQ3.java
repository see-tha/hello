package recap;
import java.util.Scanner;
public class RQ3 {
	public static void main(String[] args) {
        String original,Reverse="",temp;
           Scanner in = new Scanner (System.in);
           System.out.println("Enter a string to reverse: ");
           original = in.nextLine();
           temp=original;
           int length = original.length();
           
           for(int i=length-1;i>=0;i--) {
               Reverse = Reverse + original.charAt(i);
           }
           if(temp.compareTo(Reverse)==0)
           {
               System.out.println("palindrome");
               }
               else
               {
                   System.out.println("not pallindrome");
               }
           
}
}


