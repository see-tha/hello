package datastructure;

public class LinearSearch2 {
	public static void main(String args[])
	{
		String [] arr= {"see","deep","tvm","kochi"};
		String item="kochi";
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
