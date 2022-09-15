package Day2;

class member
{
	String name;
	int age;
	String phone;
	String address;
	int salary;
	
	public void printsalary()
	{
		System.out.println("Salary is:" +salary);
	}
}

class employee extends member
{
	String specialization;
	
}
class manager extends member
{
	String department;
	
}




public class Inheritence2 {
	public static void main(String args[])
	{
		employee emp = new employee();
		emp.name= "Seetha";
		emp.age= 23;
		emp.phone="8113005902";
		emp.address="xyz";
		emp.salary=25000;
		emp.printsalary();
		
		manager mng = new manager();
		mng.name= "Seethalakshmi";
		mng.age= 25;
		mng.phone="9995264676";
		mng.address="vvv";
		mng.salary=35000;
		
		
	}

}
