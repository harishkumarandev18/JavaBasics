package workWithNums;

public class factorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		long fact = 1; 
		/*Why long - Factorial values grow rapidly. An int overflows after 12!, whereas a long can store values upto 20!.
		 * For larger factorials, I would use BigInteger to avoid overflow.
		 */
		
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		
		System.out.println("Factorial of number "+num+" : "+ fact);
		
	}
}
