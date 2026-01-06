package workWithNums;

public class verifyPrimeNum {
	
	// To check Primenumber
	public static boolean isPrime(int num) {
		
		if (num <= 1) {
			return false;
		}
		
		for(int i = 2; i < num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	// To print primenumber for the given range
	public static void getPrimeNumbers(int num) {
		
		for(int i = 2; i <= num; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int a = 5; 
		int b = 10;
		int c = 7;
		
		System.out.println("a is prime num: "+ isPrime(a));
		System.out.println("b is prime num: "+ isPrime(b));
		System.out.println("c is prime num: "+ isPrime(c));
		
		// print prime numbers until 30
		getPrimeNumbers(30);
	}
	

}
