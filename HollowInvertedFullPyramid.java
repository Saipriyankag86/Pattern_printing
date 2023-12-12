package hollowPatterns;

public class HollowInvertedFullPyramid 
{

	public static void main(String[] args) 
	{
		 for(int i=1;i<=5;i++)
	       {
			 for(int j=1;j<i;j++)
	    	   {
	    		   
	    		   System.out.print(" ");
	    	   }
	    	   
			 for(int k=1;k<=5-i+1;k++)
	    	   {
	    		  if((i==2&&k==2)||(i==2&&k==3)||(i==3&&k==2))
	    			//if((i==2&&i<=5-2)||(k==2&&k<=5-3))  
	   		      {
	    			  System.out.print("  ");
	    		  }
	    		   
	    		  else
	    		  {
	    			  System.out.print("* ");  
	    		  }
	    		   
	    		}
	    	   
	    	   System.out.println();
	       }
	}

}
