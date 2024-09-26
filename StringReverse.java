package company.throughtworkTest;

public class StringReverse
{
	public static void main(String[] args)
	{
		
		String str = "Hi Hello Namaskar Salamalikum";
		
		String[] split = str.split(" ");
		StringBuilder sb = new StringBuilder();
		sb.ensureCapacity(str.length() * 2);
		
		for(int i = 0 ; i < split.length ; i++)
		{
			  sb.append(new StringBuilder(split[i]).reverse());
			  if(i < split.length-1)
			  {
				  sb.append(" ");
			  }
		}
		System.out.println(sb.toString());

		
	}


}


















