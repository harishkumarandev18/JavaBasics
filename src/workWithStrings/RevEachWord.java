package workWithStrings;

public class RevEachWord {

	public static void main(String[] args) {
		
		String str = "Gonna be best year for kumaran";
		String words[] = str.split("\\s+");
		//String revStr = "";
		StringBuilder sb = new StringBuilder();
		
		for(String word : words) {
			String revStr = "";
			for(int i=word.length()-1; i >= 0; i--) {
				revStr = revStr+word.charAt(i);
			}
			sb.append(revStr).append(" ");
		}
		
		System.out.println(sb);
	}

}
