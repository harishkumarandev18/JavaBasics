package workWithArrays;

public class DescendingArray {

	public static void main(String[] args) {

		int[] arr = { 800, 200, 500, 100, 600 };

		// Logic to arrange array in descending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		// The below method will work after making the array in Ascending order.
		for(int i=0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1 - i];
			arr[arr.length-1 - i] = temp;
		}

		// To printout array values
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/* We can use Collections.reverseOrder() for descending Array */
	}
}
