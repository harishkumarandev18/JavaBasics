package workWithStrings;

public class Stringlogic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "!@A#B$%C&*D#"; // Output: !@D#C$%B&*A#
		char[] charr = str.toCharArray();
		int left = 0;
		int right = charr.length-1;
		
		while(left < right) {
			if(!Character.isLetter(charr[left])) {
				left++;
			} else if(!Character.isLetter(charr[right])) {
				right--;
			} else {
				char temp = charr[left];
				charr[left] = charr[right];
				charr[right] = temp;
				
				left++;
				right--;
			}
		}
		
		System.out.println(charr);

	}

}
