package code;

public class FibonacciSeries {

	public static void main(String args[]) {

//		Fibonacci Series is sequence where each number is the sum of the two preceding ones. It starts with 0 and 1
		int n = 10; // Step 1: How many Fibonacci numbers we want 
		int first = 0; // Step 2: First number of the series 
		int second = 1; // Step 3: Second number of the series 
		System.out.print("Fibonacci Series up to " + n + " terms: "); // Step 4: Print the first two numbers 
		System.out.print(first + " " + second); // Step 5: Loop to calculate the rest 
		for (int i = 3; i <= n; i++) { 
			int next = first + second; // Step 6: Next number is sum of previous two 
			System.out.print(" " + next); // Step 7: Print the next number 
			first = second; // Step 8: Update first to previous second 
			second = next; // Step 9: Update second to new next 
		}
	}
}