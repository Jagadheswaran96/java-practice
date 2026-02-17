package code;

public class FactorialUsingLoop {

	public static void main(String[] args) {
		int input = 4;
		int output = 1;
		for (int i=1; i<=input; i++) {
			output = i*output;
		}
		System.out.println("Factorial of " + input + " is: " + output);

	}

}
