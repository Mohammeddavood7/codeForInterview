package com.patterns;

public class OccuranceOfNumber
{
	public static void numberOfOccurance(int arr[])
	{
	       for(int i = 0 ; i < arr.length ; i++)
	       {
	    	   int hold = arr[i];
	    	   if(hold == -1)
	    	   {
	    		   continue;
	    	   }
	    	   int count = 0;
	    	   for(int j=0;j<arr.length;j++)
	    	   {
	    		    if(arr[j]==hold)
	    		    {
	    		    	arr[j] = -1;
	    		         count++;
	    		    			
	    		    }
	    	   }
	    	   
	    	   System.out.println("'"+hold+"' orrance of : '"+count+"' times");
	    	   
	       }
		
		
	}
	
	public static void main(String[] args) 
	{
		int arr[]  = {1,2,2,1,2,3,5,7};
		numberOfOccurance(arr);
		
	}

}





















