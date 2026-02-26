package code;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoiners {

	public static void main(String[] args) {
		
		
		StringJoiner joinString = new StringJoiner(":", "[", "]");
		joinString.add("Jagadhes");
		joinString.add("Waran");
		System.out.println(joinString);
		
		StringJoiner stringJoiner = new StringJoiner(", ");
		stringJoiner.add("Certificate");
		stringJoiner.add("Name");
		System.out.println(stringJoiner);
		
		StringJoiner stringJoiner_2 = new StringJoiner(", ");
		stringJoiner_2.add("Certificate");
		stringJoiner_2.add("");
		System.out.println(stringJoiner_2);
		
		StringJoiner stringJoiner_3 = new StringJoiner(", ");
		stringJoiner_3.add("Certificate");
		stringJoiner_3.add(" ");
		System.out.println(stringJoiner_3);
		
		StringJoiner stringJoiner_4 = new StringJoiner(", ");
		stringJoiner_4.add("Certificate");
		stringJoiner_4.add(null);
		System.out.println(stringJoiner_4);
		
		String delimiter = ", Two ";
		String two = "One Apple";
		String three = "Orange";
		String result = String.join(delimiter, two, three);
		System.out.println(result);
		
		String delimiter_2 = ", ";
		String first = null;
		String second = null;
		String result_2 = String.join(delimiter_2, first, second);
		System.out.println(result_2);
		
		String s1 = "Certificate"; 
		String s2 = ", Name"; 
		String result_3 = s1 + s2; 
		System.out.println(result_3);
		
		StringBuilder sb = new StringBuilder(); 
		sb.append("Certificate"); 
		sb.append(", Name"); 
		String result_4 = sb.toString(); 
		System.out.println(result_4);
		
//		Mixing Join and Concatenation
		String[] words = {"Certificate", "Name"}; 
		String joined = String.join(" | ", words); 
		String finalResult = "Type: " + joined; 
		System.out.println(finalResult);
		
		List<String> arrayList = Arrays.asList("Apple", "Orange", "Banana", "Guava");
		String concatenatedString = "";
		String concatWith = ", ";
		for (String array : arrayList) {
			concatenatedString += array.concat(concatWith);
		}
		System.out.println(concatenatedString.substring(0, concatenatedString.length()-2));
		
		String concatenatedString_2 = "";
		for (String array : arrayList) {
			concatenatedString_2 += array + ", ";
		}
		System.out.println(concatenatedString_2.substring(0, concatenatedString_2.length()-2));
		
	}

}