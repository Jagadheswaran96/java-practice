package code;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortingListUsingSet {

	public static void main(String args[]) { 
		int[] count =  {22, 11, 44, 33, 66, 55};
		Set<Integer> hset = new HashSet<Integer>();
		try{
			for(int i = 0; i < count.length; i++){
				hset.add(count[i]);
			}
			System.out.println("Values from Set: " + hset);

			TreeSet<Integer> treeset = new TreeSet<Integer>(hset);
			System.out.println("Sorted Using TreeSet: " + treeset);

			Arrays.sort(count);
			System.out.println("Sorted Using Arrays Sort: " + Arrays.toString(count));

		} catch(Exception e){
			// e.printStackTrace();
		}
	}
}