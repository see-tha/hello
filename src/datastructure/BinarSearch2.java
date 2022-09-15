package datastructure;

public class BinarSearch2 {

	public static void main(String[] args) {
		String[] a = {"a","b","c","d","e"};
		String srch="e";
		int lo=0;
		int hi=a.length-1;
		int mi=(lo+hi)/2;
		
		while(lo<=hi)
		{
			if(a[mi].compareTo(a[mi])<0)
				hi=mi-1;
			
			else if(a[mi]==srch)
			{
				System.out.println("Element found at " +mi+ " index position");
				break;
				
				
			}
			else
			{
				lo=mi+1;
				
			}
			mi=(lo+hi)/2;
		}
		if(lo>mi)
		{
			System.out.println("not found");
		}
		
	}

	

}

