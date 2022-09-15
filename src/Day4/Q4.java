package Day4;

public class Q4 {
	public static void main(String args)
	{
		int array[] = new int[] {22,7,99,10};
		int small = array[0];
		int large = array[0];
		for(int i=0; i<array.length;i++)
		{
			if(array[i]>large)
				large=array[i];
			else
				small=array[i];
				
				
		}
		System.out.println("Largest of element is:" +large);
		System.out.println("Smallest of element is:" +small);
		
		
	}

}
