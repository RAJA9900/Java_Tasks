package july_29;

import java.util.Scanner;

public class ArrayTask5 {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		int arr[]= new int[10];
		n=sc.nextInt();
		System.out.println("Enter the Element");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("After removed FLequal removed : ");
		for(int i=0;i<n;i++)
		{
			if(flequals(arr[i]))
			{
				System.out.println(arr[i]);
			}
			
		}	sc.close();
				
				

	}
	public static boolean flequals(int m)
	{
		int m2=m;
		int lastdigit=0;
		int firstdigit=0;
		lastdigit=m2%10;
		while(m2>0)
		{
			firstdigit=m2%10;
			m2/=10;
		}
		if(firstdigit==lastdigit)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
