package numberPatterns;

public class Pattern2 
{

	public static void main(String[] args)
	{
	/*  12345
		2345
		345
		45
		5*/
		
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
