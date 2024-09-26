package com.patterns;

public class Isprime 
{
	public static void isPrime(int p)
	{
		
//		if(p==1)
//			System.out.println(1);
//		else if(p==2)
//			System.out.println(1+ " " +2+" "+(p<=3?"1 2 3":""));
//		else if(p <= 0)
//		System.out.println("please enter positive number");
		
		for(int i = 1 ; i <= p ; i++)
		{
			if(p == 0)
				System.out.println(i);
			
		}
		
		
		
		
	}
	 static final public void main(String[] args)
	{
		isPrime(20);
		
		
		
		
	}

}
