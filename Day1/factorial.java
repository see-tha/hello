import java.util.*;
public class factorial
{
public static void main(String args[])
{
int f=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number:");

int number = sc. nextInt();
for(int i=1; i<=number; i++)
{
f=f*i;
}
System.out.println("factorial of" +number+ " is " +f);
}
}