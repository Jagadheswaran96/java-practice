package code;

public class SeparateCharsAndNumsUsingReplaceAll {

	public static void main(String[] args) {
		String num = "jagadhes2459@";
		System.out.println("Return except numbers: " + num.replaceAll("[1-9]", ""));
		System.out.println("Return except letters: " + num.replaceAll("[a-z]", ""));
		System.out.println("Return except letters & numbers: " + num.replaceAll("[a1-z9]", ""));
	}

}
