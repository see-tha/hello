package Day4;

public class Q5 {
	public static void main(String args[])
	{
		int row= 2;
		int col=2;
		int array[][] = new int[row][col];
		
		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				array[i][j]=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("values" + array[i][j]);
			}
			System.out.println();
		}
			
		
		
		
		
		
	}

}
