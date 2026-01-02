package javaBasics_workWithNums;

public class swapTwoNum {

	public static void main(String[] args) {
		
		swapNumwithThirdVar(15, 22);
		swapNumwithoutThirdVar(33, 45);
		
	}
	
	// Swap two numbers using 3rd variable
	public static void swapNumwithThirdVar(int a, int b) {
		
		int temp = a;
		
		a = b;
		b = temp;
		
		System.out.println("Swapped using 3rd variable");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	
	
	// Swap two numbers without 3rd variable
	public static void swapNumwithoutThirdVar(int a, int b) {
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Swapped without using 3rd variable");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
