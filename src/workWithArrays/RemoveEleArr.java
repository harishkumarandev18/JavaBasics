package workWithArrays;
import java.util.Arrays;
public class RemoveEleArr {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int remIndex = 2;
		
		// creating new array
		int[] arr1 = new int[arr.length-1];
		
		// copy elements to the new array expect the index
		for (int i=0,k=0;  i < arr.length; i++) {
			if(i == remIndex)
				continue;
			
			arr1[k++] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr1));
	}
}
