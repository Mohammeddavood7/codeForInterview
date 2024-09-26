
public class Test
{
	public static void main(String[] args) 
	{
		  //[^0-9]
	    String str = "153sdkfjsj";
	    String[] rStr = str.split("[a-zA-Z]");
	    StringBuilder sb = new StringBuilder();
	    for(String s : rStr)
	    {
	    	sb.append(s);
	    }
	    System.out.println(sb);
	    
	    
	    
		
	}

}
