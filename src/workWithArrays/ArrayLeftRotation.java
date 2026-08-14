package workWithArrays;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,4,3,2,1};
		int n = arr.length;
		int k = 2;
		
		// Left Rotation
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
		reverse(arr, 0, n-1);

	}
	
	// Reverse logic
	static void reverse(int arr[], int start, int end) {
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}
}
