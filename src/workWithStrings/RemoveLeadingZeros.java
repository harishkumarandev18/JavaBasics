package workWithStrings;

public class RemoveLeadingZeros {

	public static void main(String[] args) {
		
		String str = "000001234506";
		int i = 0;
		
		// Loop to find out the zeros
		while(i < str.length() && str.charAt(i) == '0') {
			i++;
		}
		
		// Using Substring method
		String fstr = str.substring(i, str.length());
		System.out.println(fstr);
		
		// Using stringBuffer method
		// Converting string to StringBuffer and replace 0
		StringBuffer sb = new StringBuffer(str);
		sb.replace(0, i, "");
		
		// Print out the final string
		System.out.println(sb);
	}

}
