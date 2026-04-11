package code;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// It checks against case-sensitive
		String input = "CcAAaautomation";
		char[] charValue = input.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : charValue) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " appeared " + entry.getValue() + " time");
			}
			
		}

	}

}
