package com.patterns;

public class FinalDefaultValue
{
   static final int x;
   
   static int y = m1();
   
   static 
   {
	   System.out.println(y);
   }
   
   static {
	   x = 10;
   }
   
   
   public static int m1()
   {
	   return x;
   }
   
	
	public static void main(String[] args)
	{
		
		
	}

}
