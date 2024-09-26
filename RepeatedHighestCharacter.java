public class RepeatedHighestCharacter
{
	public static char repeated(String str)
	{
		int count[] = new int[256];
		
		for(int i = 0 ; i < str.length(); i++)
		{
			count[str.charAt(i)]++;
		}
		
		int max = count[str.charAt(0)];
		char hv = str.charAt(0);
		
		for (int i = 0 ; i < str.length() ; i++)
		{
			if(count[str.charAt(i)] > max)
			{
				max = count[str.charAt(i)];
				hv = str.charAt(i);
				
			}
		}
		
		return hv;
		
	}
	
	public static void main(String[] args)
	{
		String str = "aaaabbbbc";
		char ch = RepeatedHighestCharacter.repeated(str);
		System.out.println(ch);
		
		
	}

}
