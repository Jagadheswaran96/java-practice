package LeetCode;

import java.util.HashMap;

public class RansomNote_383 {
	
	/* Problem statement
	 * Given two strings ransomNote and magazine, return true if ransomNote can be
	 * constructed by using the letters from magazine and false otherwise. Each
	 * letter in magazine can only be used once in ransomNote.
	 */
	
	public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char magazineChar = magazine.charAt(i);
            int currentCount = map.getOrDefault(magazineChar, 0);
            map.put(magazineChar, currentCount + 1);
        }
        for (int j = 0; j < ransomNote.length(); j++) {
            char ransomNoteChar = ransomNote.charAt(j);
            int currentCount = map.getOrDefault(ransomNoteChar, 0);
            if (currentCount == 0) {
                return false;
            }
            map.put(ransomNoteChar, currentCount - 1);
        }
        return true;
    }
	
	public static void main (String args[]) {
		Boolean result = RansomNote_383.canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi");
		System.out.println("Result is " + result);
	}

}
