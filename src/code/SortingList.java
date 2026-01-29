package code;

import java.util.Arrays;
import java.util.Collections;

public class SortingList {

	public static void main(String[] args) {

		String[] value= {"name1","name2","name3","name4"};		
		System.out.println("Retrieve String Values with Index: " + value[1] + " " + value[2]);

		int[] values= {4,2,1,5,3};
		
		int length=values.length;
		System.out.println("Input size: " + length);

		//1. using bubble sort algorithm
		for (int i = 0; i < length; i++) {  // Outer loop runs (n-1) times
		    for (int j = 0; j < length - i - 1; j++) {  // Inner loop reduces after each pass
		        if (values[j] > values[j + 1]) {
		            int temp = values[j];
		            values[j] = values[j + 1];
		            values[j + 1] = temp;
		        }
		    }
		}
		System.out.println("Using pubble sort method: " + Arrays.toString(values));
		
		//2. using parallel sort built in method
		Arrays.parallelSort(values);
		System.out.println("Using parallel sort method: " + Arrays.toString(values));
		
		//3. using sort built in method
		Arrays.sort(values);
		System.out.println("Using sort method: " + Arrays.toString(values));
		
		//4. using collections.reverseorder built in method
		Integer[] values1= {4,2,1,5,3};
		Arrays.sort(values1, Collections.reverseOrder());
		System.out.println("Reversed using Collections.reverseOrder method: " + Arrays.toString(values1));
	}

}
