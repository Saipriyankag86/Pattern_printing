package numberPatterns;

public class PascalsTriangle 
{

	public static void main(String[] args) 
	{
		
		for(int i=0;i<5;i++)
		{
			for(int k=1;k<5-i;k++)
			{
				System.out.print(" ");
			}
			int result=1;
			for(int j=0;j<=i;j++)
			{
				
				System.out.print(result+" ");
				result=result*(i-j)/(j+1);
			}
			System.out.println();
		}

	}

}
