package code;

public class SeparateCharsAndNumsUsingCharacters {

	static void splitString(String str){
		StringBuffer alphabetic = new StringBuffer();
		StringBuffer number = new StringBuffer();
		StringBuffer specialCharacter = new StringBuffer();
		for (int i=0; i<str.length(); i++){
			if (Character.isDigit(str.charAt(i))) {
				number.append(str.charAt(i));
			} else if(Character.isLetter(str.charAt(i))) {
				alphabetic.append(str.charAt(i));
			} else {
				specialCharacter.append(str.charAt(i));
			}
		}
		System.out.println("Letters: " + alphabetic);
		System.out.println("Numbers: " + number);
		System.out.println("Special Characters: " + specialCharacter);
	}
	public static void main(String args[]){
		String str = "Ajagadhes@mani#eesa123$vishnu";
		splitString(str);
	}
}