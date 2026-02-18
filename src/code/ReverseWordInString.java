package code;

public class ReverseWordInString {

	public static void main(String[] args) {
		
		String input = "Reverse a Word";
        String[] words = input.split(" ");
        
//		1. Reverse the word
        String reversedWord = "";
        for (int i = words.length - 1; i >= 0; i--) {
        	reversedWord += words[i] + " ";
        }
        System.out.println("Reverse the word: " + reversedWord);
        
//      2. Reverse the characters of each word without reversing word
        System.out.print("Reverse the characters of each word without reversing word: ");
        for (String word : words) {
        	for (int i=word.length()-1; i>=0; i--) {
        		System.out.print(word.charAt(i));
        	}
        	System.out.print(" ");
        }

	}

}
