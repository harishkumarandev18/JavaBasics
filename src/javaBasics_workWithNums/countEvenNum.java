package javaBasics_workWithNums;

import java.io.IOException;
import java.util.Scanner;

public class countEvenNum {

	public static void main(String[] args) throws IOException {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number range");
		int num = obj.nextInt();
		int count=0;
		
		// count the even numbers
		for(int i = 1; i <= num; i++) {
			if(i%2 == 0) {
				count++;
			}
		}
		System.out.println("The total number of Even numbers: "+count);
	}
}
