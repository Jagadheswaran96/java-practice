package code;

import java.util.StringJoiner;

public class StringJoiners {

	public static void main(String[] args) {
		StringJoiner joinString = new StringJoiner(":", "[", "]");
		joinString.add("Jagadhes");
		joinString.add("Waran");
		System.out.println(joinString);
	}

}