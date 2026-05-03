package code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWordsWithMap {

	public static void main(String[] args) {

		String input = "Testing Java against Java";
		String[] splitInput = input.split("\\s");
		System.out.println(Arrays.toString(splitInput));
		
		Map<String, Integer> map = new HashMap<>();
		
		for (String str : splitInput) {
			map.put(str, map.getOrDefault(str, 0) + 1);
			if (map.containsKey(str) && map.get(str) > 1) {
				System.out.println(str + ": " + map.get(str));
			}
		}
		
	}

}
