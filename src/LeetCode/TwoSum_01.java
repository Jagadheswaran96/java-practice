package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_01 {

	public static void main(String[] args) {
		/*
		 * Given an array of integers nums and an integer target, return indices of the
		 * two numbers such that they add up to target.
		 */
		int[] input = {3,2,4};
		int target = 6;
		int[] output = TwoSum_01.twoSum(input, target);
		System.out.println("Indices of two sum array is " + Arrays.toString(output));
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			ans = target - nums[i];
			if (map.containsKey(ans)) {
				return new int[]{map.get(ans), i};
			}
			map.put(nums[i], i);
		}
		return new int[]{};
	}

}
