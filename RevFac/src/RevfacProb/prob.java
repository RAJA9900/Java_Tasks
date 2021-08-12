package RevfacProb;

import java.util.Scanner;

public class prob {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int N;
		Scanner sc=new Scanner(System.in);
	    N=sc.nextInt();
		
		int rev=revOfNum(N);
		System.out.println("Reverse of a no : "+rev);
		fac(rev);
		sc.close();
		
	}	
	public static int revOfNum(int N)
	{
		int N1;
		int rev=0;
		while(N>0)
		{
			N1=N%10;
			rev=(rev*10)+N1;
			N=N/10;
		}
		return rev;
	}
	
	public static void fac(int rev)
	{
		System.out.print("factors are: ");
		int count =0;
		while (rev%2==0)
        {
            System.out.print(2 + " ");
            count++;
            rev /= 2;
        }
 
        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(rev); i+= 2)
        {
            // While i divides n, print i and divide n
            while (rev%i == 0)
            {
                System.out.print(i + " ");
                rev /= i;
            }
        }
 
        // This condition is to handle the case whien
        // n is a prime number greater than 2
        if (rev > 2)
           System.out.print(rev);
          
        System.out.println("\nThe no of 2's are"+count);
        //int ans=rev.stream().
	}
				

	

}
