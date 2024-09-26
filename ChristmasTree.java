package com.patterns;

public class ChristmasTree
{ 
	public static void isChris(int h)
	{
		for(int i = 1 ; i <= h ; i++)
		{
			
			for(int j = i ; j < h; j ++)
			{
				System.out.print(" ");
			}
			
			for(int k = 1 ; k <= (2 * i - 1) ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1 ; i < h ; i++)
			System.out.print(" ");
			System.out.print("*");
		
	}
	
	
	public static void isDRgt(int h)
	{
		for(int i = 1 ; i <= h ; i++)
		{
			for(int j = i ; j < h; j++)
				System.out.print("*");
			System.out.println();
		}
		
		
		
	}
	
	
	    public static void isLft(int height)
	    {
	        

	        for (int i = 0; i < height; i++)
	        {
	            for (int j = 0; j <= i; j++)
	            {
	                System.out.print("*");
	            }

	            System.out.println();
	        }

	       
	}

	    public static void isRgt(int height)
	    {
           for (int i = 0; i < height; i++)
           {
            for (int j = height - 1; j > i; j--) 
            {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k <= i; k++)
            {
                System.out.print("*");
            }
          }
	    }
	
	    
	
	
    public static void main(String[] args)
    {
    	//isChris(5);
    	//isRgt(5);
    	
    	isLft(5);
    }


}

































