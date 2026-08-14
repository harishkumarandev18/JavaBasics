package workWithArrays;

import java.util.Arrays;

public class ArrayRightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		int k = 3;
		
		// Right rotation
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
		
		System.out.println(Arrays.toString(arr));

	}
	
	// Reverse Logic
	static void reverse(int arr[], int start, int end) {
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}
}
