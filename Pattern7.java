package numberPatterns;

public class Pattern7 
{

	public static void main(String[] args) 
	{
	/*	1
		21
		321
		4321
		54321*/
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
