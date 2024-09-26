package com.april25.test1;

import java.util.ArrayList;
import java.util.List;

public class Demo1 
{
	public static void main(String[] args)
	{
	  int arr[] = {1,2,3,4,5};
	 List<Integer> al = new ArrayList<>();
		
	 for(int i = 0; i < arr.length; i++)
	 {
		 al.add(arr[i]);
		 
	 }
	 
	 System.out.println(al);
	}

}
