package july_29;

public class Arraytask4 {

	public static void main(String[] args)
	{
		//System.out.println(isprime(123));
		int arr[]= {101,123,56,78,33,79};
		System.out.println("The Prime no in the array are :");
		for(int i=0;i<arr.length;i++)
		{
			if(isprime(arr[i]))
			{
				System.out.println(arr[i]);
			}
			
		}
		
		
		
	}



    public static boolean isprime(int n)
    {
       int flag=0;
	   int n2=n;
	   int m=n2/2;


	   if(n2==0||n2==1)
	   {
		  flag=1;
	   }
	   else
	   {
		for (int i=2;i<m;i++)
		{
		if(n2%i==0)
		{
			flag=1;
			break;
		}
		}
	   }
	   if(flag==0)
	   {
		   return true;
	   }
	   else {
		   return false;
	   }
    }

}
