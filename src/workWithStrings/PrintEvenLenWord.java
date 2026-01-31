package workWithStrings;

public class PrintEvenLenWord {

	public static void main(String[] args) {
		
		String str = "Kumaran will become successfull for sure";
		
		// split String
		String[] strArr = str.split("\\s+");
		
		// Iterate and print even length words
		for(String printStr : strArr) {
			if(printStr.length() % 2 == 0) {
				System.out.println(printStr);
			}
		}
	}
}
