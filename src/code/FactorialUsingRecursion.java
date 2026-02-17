package code;

public class FactorialUsingRecursion {
	
//	Factorial is nothing but multiplying all positive integers up to given number
//	e.g: Factorial for 4 is 4*3*2*1 = 24

	
	public int factorial (int n) {
		
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial (n-1);
	}

	public static void main(String[] args) {

		FactorialUsingRecursion factorialUsingRecursion = new FactorialUsingRecursion();
		int result  = factorialUsingRecursion.factorial(9);
		System.out.println("Factorial of given number: " + result);
	}

}