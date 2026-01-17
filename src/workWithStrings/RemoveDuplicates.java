package workWithStrings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "This is Harish Kumaran";
		String strLow = str.replaceAll("\\s+","").toLowerCase();
		
		Set<Character> setCh = new HashSet<>();
		
		for(int i=0; i<strLow.length(); i++) {
			setCh.add(strLow.charAt(i));
		}
		
		System.out.println(setCh);
	}

}
