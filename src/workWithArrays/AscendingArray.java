package workWithArrays;

public class AscendingArray {

	public static void main(String[] args) {
		
		int[] arr = {800, 200, 500, 100, 600};
		
		// Logic to arrange array in ascending order
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		// To printout array values
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	/* Array.sort() method also preferable to use */ 
}
