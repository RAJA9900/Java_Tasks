package july_29;

public class Arraytask3 {

	public static void main(String args[])
	{
		int ar[]= {101,234,567,323,202,2002};
		System.out.println("Thye palindrome no in the array are: ");
		for(int i=0;i<ar.length;i++)
		{
			if(checkpalindrome(ar[i]))
			{
				System.out.println(ar[i]);	
			}
		}	
	}

    public static boolean checkpalindrome(int n)
    {
    	int k=0,n1;
    	int n2 =n;
    	while(n2!=0)
    	{
    		n1=n2%10;
    		k=(k*10)+n1;
    		n2=n2/10;
    	}
    	//System.out.println(n);
    	if(n==k)
    	{
    		return true;
    	}
    	else
    	{
    	    return false;
    	}
    	
    }
}
