package workWithStrings;

public class vowelCount {

	public static void main(String[] args) {
		
		String str = "Harish Kumaran is a Senior Test Engineer";
		String str1 = str.toUpperCase();
		System.out.println(str1);
		int count = 0;
		char[] chArr = str1.toCharArray();
		
		for(int i = 0; i < chArr.length; i++) {
			char ch = chArr[i];
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				count++;
			}
		}
		
		System.out.println("Total No of vowels is - " +count);

	}

}
