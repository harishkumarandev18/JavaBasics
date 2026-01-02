package javaBasics_workWithNums;

import java.util.Scanner;

public class checkPalindrome_RevNum {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = obj.nextInt();
		int temp = num;
		
		int rev = 0;
		
		// function to reverse num
		while(num>0) {
			int n = num%10;
			rev = (rev*10)+n;
			num = num/10;
		}
		
		System.out.println("Reverse num: "+rev);
		
		// check palindrome number
		if(rev == temp) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not a Palindrome number");
		}
	}
}
