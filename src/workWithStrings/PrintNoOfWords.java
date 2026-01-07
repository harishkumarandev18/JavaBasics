package workWithStrings;

import java.util.Scanner;

public class PrintNoOfWords {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the line of words");
		String str = obj.nextLine();
		
		String[] arr = str.split(" ");
		int length = arr.length;
		
		System.out.println("Total No of words in the sentence is - "+ length);

	}

}
