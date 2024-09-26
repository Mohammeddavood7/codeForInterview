package com.patterns;

public class Swaping2Number 
{
	public static void main(String[] args) {
		
		int a = 10;
		int b =98;
		System.out.println("Original Values a :"+a+" "+" b:"+b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a : "+a+ " "+"b: "+b);
		
	}

}
