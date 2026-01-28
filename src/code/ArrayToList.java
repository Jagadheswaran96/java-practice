package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	//there are multiple way as below:
	/*
	 * 1.Using Arrays.asList() Method 2.Using Collections.addAll() Method 3.Using
	 * Java 8 Stream API 4.Using Guava Lists.newArrayList() Method
	 */
	public static void main(String args[]) {
		
		String array[] = { "Golf", "Soccer", "Baseball", "Volleyball", "Tennis", "Badminton", "Rugby", "Archery", "Skiing"};   
		
		System.out.println("Array before conversion: "+ Arrays.toString(array)); 

		System.out.println("Array as List using Arrays.asList(): "+ Arrays.asList(array));

		List<String> list = ArrayToListConversion(array); 
		System.out.println("Array as list using Lists.newArrayList(): " + list); 
	}    

	//creating a generic function that converts the Array into List  
	public static <T> List<T> ArrayToListConversion(T array[]) {   
		//creating the constructor of the List interface  
		List<T> list = new ArrayList<>();   
		for (T t : array) {   
			list.add(t);   
		}   
		return list;   
	}    
}
