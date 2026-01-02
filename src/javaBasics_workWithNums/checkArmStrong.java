package javaBasics_workWithNums;

import java.util.Scanner;

public class checkArmStrong {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = obj.nextInt();
		int temp = num;
		int armNum = 0;
		
		// function to check Armstrong
		while(num>0) {
			int n = num%10;
			armNum = armNum + (n*n*n);
			num = num/10;
		}
		
		// Print result
		if (armNum == temp)
			System.out.println("It is a Armstrong number");
		else
			System.out.println("It is not a Armstrong number");
	}

}
