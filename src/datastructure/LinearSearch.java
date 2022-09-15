package datastructure;

public class LinearSearch {
	public static void main(String args[])
	{
		int [] arr= {1,4,8,9,12};
		int item=4;
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==item)
			{
				System.out.println("idex is " +i);
				temp=temp+1;
			}	
		}
			if(temp==0) {
			System.out.println("item is not found");
		}
		
	}
	

}
