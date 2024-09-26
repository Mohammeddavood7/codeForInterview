	package com.patterns;
	
	public class ArmStrongNumber
	{
		public static boolean isArmStrong(int n)
		{
			
			int original = n;
			int count = 0;
			
			while(n != 0)
			{
				count++;
				n /= 10;
			}
			
			int result = 0;
			int hold = original;
			
			while(original != 0)
			{
				int rem = original % 10; // 3 5 1
				System.out.println(rem);
				result += Math.pow(rem,count);
				original /= 10;
			}
			
			if(result == hold)
			{
				return true;
			}
			
			
			return false;
			
		}
		
		public static void main(String[] args)
		{
			
		
			if(isArmStrong(153))
			{
				System.out.println("It is armstrong number");
			}
			else
			{
				System.out.println("It is not armstrong number");
	
			}
			
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
