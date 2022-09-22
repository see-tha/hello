package recap;

class Student{  
    int rollno;  
    String name;  
    static String college = "Rajagiri";  
     
    static void change(){  
    college = "Amrita";  
    }  
    
    Student(int r, String n){  
    rollno = r;  
    name = n;  
    }  
      
    void display(){System.out.println(rollno+" "+name+" "+college);}  
}
public class Static_Key1{  
    public static void main(String args[]){  
    Student.change();  
    Student s1 = new Student(101,"Seetha");  
    Student s2 = new Student(102,"Arnav");  
    Student s3 = new Student(103,"Nanna");  
   
   s1.display();  
   s2.display();  
   s3.display();  
   }  }