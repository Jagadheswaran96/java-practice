package code;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortingListUsingSet {

	public static void main(String args[]) {
		int[] count =  {22, 11, 44, 33, 66, 55};
		Set<Integer> hset = new HashSet<>();
		try{
			for (int element : count) {
				hset.add(element);
			}
			System.out.println("Values from Set: " + hset);

			TreeSet<Integer> treeset = new TreeSet<>(hset);
			System.out.println("Sorted Using TreeSet: " + treeset);

			Arrays.sort(count);
			System.out.println("Sorted Using Arrays Sort: " + Arrays.toString(count));

		} catch(Exception e){
			// e.printStackTrace();
		}
	}
}