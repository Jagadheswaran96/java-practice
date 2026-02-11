package code;

public class FactorialUsingRecursion {
	
	public int factorial (int n) {
		
		if (n == 0 || n== 1) {
			return 1;
		}
		return n * factorial (n-1);
	}

	public static void main(String[] args) {

		FactorialUsingRecursion factorialUsingRecursion = new FactorialUsingRecursion();
		int result  = factorialUsingRecursion.factorial(2);
		System.out.println("Factorial of given number: " + result);
	}

}
