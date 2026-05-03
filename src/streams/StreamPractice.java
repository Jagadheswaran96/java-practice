package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
		/*
		 * A stream represents a sequence of data. The key aspect of the stream API is
		 * its ability to perform pipeline operations that search, filter, map, or
		 * otherwise manipulate data.
		 */

		/*
		 * A stream typically has 3 parts called as Stream Pipeline: Source,
		 * Intermediate operations (lazy), Terminal operation (triggers execution)
		 */

		// Sample
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);

		numbers.stream()	// Source
		.filter(n -> n % 2 == 0)   // Intermediate operations (lazy)
		.map(n -> n * 2)           // Intermediate operations (lazy)
		.forEach(System.out::println);	// Terminal operation (triggers execution)

		// Common Operations: Filtering
		List<Integer> list = List.of(6, 7, 7, 9, 3, 1, 5, 2, 4);
		list.stream()
		.filter(x -> x > 10)
		.toList()
		.forEach(System.out::println);

		// Common Operations: Mapping
		list.stream()
		.map(x -> x * x)
		.toList()	
		.forEach(System.out::println);

		// Common Operations: Sorting
		list.stream()
		.sorted()
		.toList()	
		.forEach(System.out::println);

		// Common Operations: Reducing (aggregation)
		int sum = list.stream()
				.reduce(0, Integer::sum);
		System.out.println("Sum: " + sum);

		// Collecting Results
		List<String> names = List.of("Alice", "Bob", "Charlie");

		List<String> result = names.stream()
				.filter(name -> name.startsWith("A"))
				.toList();
		System.out.println("Name Result: " + result);

		// Using collectors
		List<String> result1 = names.stream()
				.filter(name -> name.length() > 3)
				.collect(Collectors.toList());
		System.out.println("Name Result Using collectors: " + result1);

		names.stream()                   // Source
		.filter(n -> n.startsWith("A")) // Intermediate (lazy)
		.map(String::toUpperCase)       // Intermediate
		.forEach(System.out::println);  // Terminal (executes)

		// Used flatMap() for flattening nested collections
		List<List<String>> list1 = List.of(
				List.of("A", "B"),
				List.of("C", "D"));
		list1.stream()
		.flatMap(Collection::stream)
		.forEach(System.out::println);

		// distinct()
		List<Integer> distinct = list.stream().distinct().toList();
		System.out.println("Distinct: " + distinct);
		
		// sorted()
		List<Integer> sorted = list.stream().sorted().toList();
		System.out.println("Sorted: " + sorted);
		
		// Custom sorting
		List<Integer> customSorting = list.stream()
	    .sorted((a, b) -> b - a)
	    .toList();
		System.out.println("Custom Sorting: " + customSorting);
		
		// limit()
		List<Integer> limit = list.stream().limit(3).toList();
		System.out.println("Limit: " + limit);
		
		// skip()
		List<Integer> skip = list.stream().skip(2).toList();
		System.out.println("Skip: " + skip);
		
		// count()
		long count = list.stream().count();
		System.out.println("Count: " + count);
		
		// anyMatch / allMatch / noneMatch / findFirst / findAny
		list.stream().anyMatch(x -> x > 10);
		list.stream().allMatch(x -> x > 0);
		list.stream().noneMatch(x -> x < 0);
		list.stream().findFirst().get();
		list.stream().findAny().get();
		
		// map() vs flatMap()
		List<String> words = List.of("hello", "world");

		words.stream()
		     .map(word -> word.split(""))
		     .forEach(Arrays::toString);  // Nested
		words.stream()
	     .flatMap(word -> Arrays.stream(word.split("")))
	     .forEach(System.out::println);  // Flattened
	}

}
