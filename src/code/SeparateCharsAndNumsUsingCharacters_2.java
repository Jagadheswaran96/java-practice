package code;

public class SeparateCharsAndNumsUsingCharacters_2 {
	
	public static void separator(String value) {
		StringBuffer numberBuffer = new StringBuffer();
		StringBuffer characterBuffer = new StringBuffer();
		StringBuffer alphabeticalBuffer = new StringBuffer();
		for (int i = 0; i < value.length(); i++) {
			if (Character.isAlphabetic(value.charAt(i)))
				alphabeticalBuffer.append(value.charAt(i));
			else if(Character.isDigit(value.charAt(i)))
				numberBuffer.append(value.charAt(i));
			else
				characterBuffer.append(value.charAt(i));
 		}
		System.out.println("Number: " + numberBuffer);
		System.out.println("Special Characters: " + characterBuffer);
		System.out.println("Alphabeticals: " + alphabeticalBuffer);
	}	
	public static void main(String[] args) {
		String value = "Aqwerty!@#$%%^123456";
		separator(value);
	}
}