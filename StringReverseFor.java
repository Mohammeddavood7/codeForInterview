package company.throughtworkTest;

public class StringReverseFor 
{
	public static void main(String[] args)
	{
	  String str = "Hey Hello Hi";
	  String[] sp = str.split(" ");
	 
	  for(int i = 0 ; i < sp.length ; i++)
	  {
		    for (int j = sp[i].length()-1; j >= 0 ; j--)
		    {
		    	System.out.print(sp[i].charAt(j));
		    }
		    System.out.print(" ");
	  }
		
	}

}
