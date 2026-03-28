package workWithStrings;

public class ExpandCompStr {

	public static void main(String[] args) {
		String str = "a3b2c1d4";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isLetter(ch)) {
				int count = str.charAt(i+1) - '0';
				for(int j=0; j<count; j++) {
					sb.append(ch);
				}
			}
		}
		
		System.out.println(sb.toString());
	}
}
