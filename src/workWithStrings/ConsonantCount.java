package workWithStrings;

public class ConsonantCount {

	public static void main(String[] args) {
		
		String str = "Kumaran";
		String uprStr = str.toUpperCase();
		
		int count = 0;
		
		for(int i = 0; i < uprStr.length(); i++) {
			char ch = uprStr.charAt(i);
			if(!(ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')) {
				count++;
			}
		}
		
		System.out.println("Total Consonant: " + count);
	}
}
