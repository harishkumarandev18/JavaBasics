package workWithStrings;

public class printOnlyNum {

	public static void main(String[] args) {
		
		String str = "kumaran1814Success";
		String numStr = "";
		
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='0' && ch<'9') {
				numStr = numStr+ch;
			}
		}
		
		System.out.println(numStr);
	}
}
