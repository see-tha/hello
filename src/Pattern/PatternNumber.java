package Pattern;

public class PatternNumber {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++)
		{
			if(i==2)
			{
				System.out.println((i) + " "+(i-1));
				System.out.println();
			}
			else
			{
				for(int j=1; j<=3; j++)
				{
					System.out.println(1+ " " +j);
					System.out.println();
				}
			}
		}

	}

}
