package july_29;

public class ArrayTask1 {
	public static void main(String[] args)
	{
		int arr[]= {10,30,40,60,78,93,67,23,12,56};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("The Maximum No in the Array: "+max);
	}

}
