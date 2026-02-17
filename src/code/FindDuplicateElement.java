package code;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};

//        1. Without using collection
        System.out.print("Found duplicate using loop is: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}
            }
        }
        System.out.println();
        
//        2. With using collection
        System.out.print("Found duplicate using collection is: ");
        Set<Integer> set = new HashSet<>();
        for (int a : arr) {
        	if (!set.add(a)) {
        		 System.out.print(a + " ");
        	}
        }
        
    }
}