package javaBasics_workWithNums;

import java.util.Scanner;

public class printOddNum {

	public static void main(String[] args) {
		
		// To read input
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number range to print odd number");
		int num = obj.nextInt();
		
		// print odd numbers
		for(int i = 1; i <= num; i++) {
			if(!(i%2==0)) {
				System.out.println(i);
			}
		}
	}
}
