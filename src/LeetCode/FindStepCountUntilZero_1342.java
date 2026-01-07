package LeetCode;

public class FindStepCountUntilZero_1342 {
	
	public static int steps (int number) {
		int steps = 0;
		while (number != 0) {
			if (number%2 == 0) {
				number = number/2;
			} else if (number%2 !=0) {
				number = number-1;
			}
			steps++;
		}
		return steps;
	}

	public static void main(String[] args) {
		int result = FindStepCountUntilZero_1342.steps(90);
		System.out.println("Number of Steps to Reduce a Number to Zero is " + result);
	}

}
