package code;

public class EvenNumberFromString {

	public static void main(String[] args) {

		String input = "123456";
		int inputSize = input.length();
		for (int i=0; i<inputSize; i++) {
			char ch = input.charAt(i);
			int number = ch-'0'; // Convert from char to int
			if (number % 2 == 0) {
				System.out.print(number);
			}
		}

	}

}
