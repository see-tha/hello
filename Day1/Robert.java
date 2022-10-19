import java.util.*;
public class Robert
{
public static void main(String args[])
{
int count = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number:");
int a =sc.nextInt();
System.out.println("Enter second number:");
int b = sc.nextInt();
for(int i=1;i<a || i<=b ;i++)
{
if(a%i==0 && b%i==0)
{
count=count+1;
}
}

System.out.println("count is"+count);

}}