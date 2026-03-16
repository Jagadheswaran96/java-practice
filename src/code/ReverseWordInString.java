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
        
//      2. a) Reverse the characters of each word without reversing word using loop
        System.out.print("2. a) Reverse the characters of each word without reversing word: ");
        for (String word : words) {
        	for (int i=word.length()-1; i>=0; i--) {
        		System.out.print(word.charAt(i));
        	}
        	System.out.print(" ");
        }
        
        System.out.println();
        
//      2. b) Reverse the characters of each word without reversing word using stringbuilder
		String reverseWord = ""; 
		for (String w : words) { 
		StringBuilder sb = new StringBuilder(w); 
		sb.reverse(); 
		reverseWord = reverseWord + sb.toString() + " "; 
		}
		System.out.println("2. b) Reverse the characters of each word without reversing word: " + reverseWord);
	}

}
