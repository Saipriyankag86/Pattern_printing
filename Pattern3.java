package numberPatterns;

public class Pattern3
{

	public static void main(String[] args) 
	{
		/*54321
		4321
		321
		21
		1*/
		for(int i=1;i<=5;i++)
		{
			for(int j=5-i+1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
