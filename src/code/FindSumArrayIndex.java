package code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindSumArrayIndex {

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        findSubarrayWithSum(arr, target);
    }

    public static void findSubarrayWithSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {

            currentSum += arr[i];

            // Case 1: subarray starts from index 0
            if (currentSum == target) {
                System.out.println("Subarray found from index 0 to " + i);
                return;
            }
//            System.out.println(Arrays.asList(map));
//            System.out.println(map);
//            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//            }
//            for (Integer key : map.keySet()) {
//                System.out.println("Key: " + key + ", Value: " + map.get(key));
//            }
//            for (Integer value : map.values()) {
//                System.out.println("Value: " + value);
//            }
//            map.forEach((key, value) -> 
//            System.out.println("Key: " + key + ", Value: " + value)
//        );
//            Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
//
//            while (iterator.hasNext()) {
//                Map.Entry<Integer, Integer> entry = iterator.next();
//                System.out.println(entry.getKey() + " = " + entry.getValue());
//            }
//            map.entrySet()
//            .forEach(e -> System.out.printf("Key=%d | Value=%s%n", e.getKey(), e.getValue()));
            String mapAsString = map.toString();
            System.out.println(mapAsString);
            
            // Case 2: subarray found using prefix sum
            if (map.containsKey(currentSum - target)) {
                int start = map.get(currentSum - target) + 1;
                System.out.println("Subarray found from index " + start + " to " + i);
                return;
            }

            // Store prefix sum
            map.put(currentSum, i);
        }

        System.out.println("No subarray with the given sum found.");
    }
}

