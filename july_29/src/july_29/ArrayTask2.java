package july_29;
import java.util.Arrays;

public class ArrayTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3, 1, 2, 3, 4, 5, 1, 6, 2, 2};
		removeDuplicates(arr1);
	}
	
	public static void removeDuplicates(int[] arr1) {
		System.out.println("Array with duplicates : " +Arrays.toString(arr1));
		int[] arr2 = new int[arr1.length];
		int j = 0;
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length-1; i++) {
			if(arr1[i] != arr1[i+1]) {
				arr2[j++] = arr1[i];
			}
		}
		arr2[j++] = arr1[arr1.length-1];
		System.out.println("Array without duplicates(with  zero's) : " +Arrays.toString(arr2));
		
		System.out.print("Array without duplicates(without zero's) : ");
		for (int i = 0; i < j; i++) {
			System.out.print(arr2[i]+ " ");
		}
		
	}

}