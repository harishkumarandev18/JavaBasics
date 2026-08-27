package workWithNums;

public class NumLogical1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 8, 18, 22, 52}; // Output: 31, 82, 183, 228, 5218
		
		// Logic 1
		for(int i=0; i<arr.length-2; i++) {
			String res = String.valueOf(arr[i+2]) + arr[i];
			System.out.print(res+", ");
		}
		
		// Login 2
		for(int i=0; i<arr.length-2; i++) {
			System.out.print(arr[i+2] + "" + arr[i] + ", ");
		}
		
		// Logic 3
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length-2; i++) {
			sb.append(arr[i+2]);
			sb.append(arr[i]);
			sb.append(", ");
		}
		System.out.println(sb);
	}
}
