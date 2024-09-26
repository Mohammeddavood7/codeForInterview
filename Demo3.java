package com.april25.test1;

import java.util.ArrayList;
import java.util.List;

public class Demo3 
{
	public static void main(String[] args)
	{
		
		List<Integer> al = new ArrayList<>();
	    al.add(1);
	    al.add(2);
	    al.add(3);
	    al.add(4);
	    al.add(5);
	    int s = al.size()/2;
	    System.out.println("middle element is: "+al.get(s));
	    

		
	}

}
