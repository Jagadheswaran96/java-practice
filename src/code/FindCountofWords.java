package code;

public class FindCountofWords {

	public static void main(String[] args) {

		String message = "One Two Three Four";
		int length = message.length();
		int count = 1;
		for (int j = 0; j < length; j++) {
			if((message.charAt(j)==' ') && (message.charAt(j+1)!=' ')){
				count++;
			}
		}
		System.out.println(count);

		//using split method
		String words = "One Two Three Four";
		int countWords = words.split("\\s").length;
		System.out.println(countWords);

		String input = "One Two Three Four";
		int wordCount = input.trim().split(" ").length;
		System.out.println(wordCount);
		
		String sentence = "One Two, Three Four"; 
		String[] word = sentence.trim().split("[^a-zA-Z]+"); 
		int counts = word.length; 
		System.out.println("Word count: " + counts);
		
		String wordings = "One Two Three Four";
		char[] splitted = wordings.toCharArray();
		int wordCounts = 1;
		boolean inWord = false;
		for (char split : splitted) {
			if (Character.isWhitespace(split)) {
				inWord = false;
				wordCounts++;
			} else if (!Character.isWhitespace(split)) {
				inWord=true;
			}
		}
		System.out.println(wordCounts);
	}
}
