package MaxLength;

public class FindMaxLength {

	public static void main(String[] args) {
		String s="Hi hello how are doing in your Education";
		maxLength(s);
		// TODO Auto-generated method stub
	}
    public static void maxLength(String s)
    {
    	String str[]=s.split(" ");
    	String out="";
    	int max=0;
    	for (int i=0;i<str.length;i++)
    	{
    		if(str[i].length()>max)
    		{
    			max=str[i].length();
    		}
    	}
    	System.out.println(max);
    	for (int i=0;i<str.length;i++)
    	{
    		if(str[i].length()==max)
    		{
    			out=out+" "+str[i];
    			System.out.println(out);
    		}
    	}
    }
}
