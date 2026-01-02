package javaBasics_workWithNums;

import java.util.Scanner;

public class countDigits {

	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = obj.nextInt();
	int count = 0;
	
	// function to check the count
	while(num>0) {
		count++;
		num = num/10;
	}
	
	System.out.println("Total Digits: "+count);

	}
}
