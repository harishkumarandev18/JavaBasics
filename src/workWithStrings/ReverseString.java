package workWithStrings;

import java.util.Scanner;

public class ReverseString {
	
	// Function to Reverse String
	public static void revStr(String str) {
		
		String rev = "";
		int length = str.length();
		
		for(int i = length-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str = obj.nextLine();
		
		revStr(str);
		
	}
}
