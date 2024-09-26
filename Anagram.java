package com.strings;

import java.util.Arrays;

public class Anagram 
{
	public static boolean isAnagram(String a,String b)
	{
		String p = a.replaceAll("\\s", "").toLowerCase();
		String q = b.replaceAll("\\s", "").toLowerCase();
		
		char[] word1 = p.toCharArray();
		char[] word2 = q.toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
	    		
		return Arrays.equals(word1, word2);
		
	}
	
	
	public static void main(String[] args)
	{
		boolean anagram = Anagram.isAnagram("Care", "race");
		
		if(anagram)
		{
			System.out.println("both words are 'ANAGRAM'");
		}
		else
		{
			System.out.println("both words are Not 'ANAGRAM'");

		}
	}

}
