package datastructure;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {1,2,6,3,9,7,4,8,10,13,12};
		int srch=13;
		int lo=0;
		int hi=a.length-1;
		int mi=(lo+hi)/2;
		
		while(lo<=hi)
		{
			if(a[mi]==srch)
			{
				System.out.println("element is present in " +mi+ " index position");
				break;
				
			}
			else if(a[mi]<srch)
			{
				lo=mi+1;
			}
			else
			{
				hi=mi-1;
			}
			mi=(lo+hi)/2;
		}
		if(lo>hi)
		{
			System.out.println("not found");
		}
		
	}

	

}
