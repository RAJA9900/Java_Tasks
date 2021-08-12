package challange2;

public class Array_task {
	
	/*A integer array is given as input. find the difference between each element.
	 Return the index of the largest element which has the largest difference gap.
	 input: {2,3,4,2,3}
	 logic: 2-3=1,3-4=1,4-2=2,2-3=1
	 2 is the max diff between 4 and 2,return the index of 4(2)
	 output:2
	 */
	 public static void main(String[] args)
	    {
	    	int[] a= {9,5,0,3,6,2,8,1,9,3};
	    	System.out.println(a.length);
	    	larDiff(a);
	    }
	    public static void larDiff(int[] a)
	    {
	    	
	    	int count =0;
	    	int j=0;
	    	int c=0;
	    	
	    	for(int i=0;i<a.length;i++)
	    	{
	    		int w=i+1;
	    		//for(int w=i+1;w<a.length;)
	    		while(w <a.length)	
	    		{
	    		       c=a[i]-a[w];
	    		       break;
	    		}
	    		if(c>count)
	    		{
	    			count=c;
	    			j=i;
	    		}
	    	}
	    System.out.println("The lardiff is: "+j);
	    }
	    
}
