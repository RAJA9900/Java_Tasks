package july_29;

public class Palindrometest {
	
public static void main(String[] args) {
		
		String s="racecar is the racecar";
		System.out.println(convertToTitleCase(s));

	}
	
	public static String convertToTitleCase(String s)
	{
		String ar[]=s.split(" ");
		//System.out.println(s);
		StringBuilder sb=new StringBuilder();
		for(int w=0;w<ar.length;w++)
		{
			//System.out.println(ar[w]);
			if(isPalindrome(ar[w]))
			{
				sb.append(ar[w]);
				sb.append(" ");
				//System.out.println(sb);
			}
			else
			{
				//sb.reverse().append(" ");
				sb.append(new StringBuilder(ar[w]).reverse().toString()).append(" ");
				//System.out.println(sb);
			}
			
		}
	return sb.toString();
	}
	
	
	public static boolean isPalindrome(String s) {
			//System.out.println(s);
		return new StringBuilder(s).reverse().toString().equals(s);
	}

}
