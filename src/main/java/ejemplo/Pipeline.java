package ejemplo;

import java.util.*;
import java.util.stream.Collectors;

/** 
 * Simple implementation of a collection pipeline (sequence
 * of aggregate operations) that takes a list of Strings,
 * makes upper case those with even length and concatenates
 * the result in alphabetical order.
 * E.g. “d”, “BaBb”, “cab”, “aB” must result in “ABBABB” 
 */
public class Pipeline {
	
	public static void main(String[] argv) throws Exception {
		List<String> list = Arrays.asList("d", "BaBb", "cab", "aB"); // So created, the List is immutable
		String result = list
				.stream() // Aggregate operations in Java 8 are made on streams, not collections
				.filter(s -> s.length() % 2 == 0) // Keep those with even length						
				.map(String::toUpperCase) // Make them upper case
				.sorted() // Sort after making them upper case to preserve alphabtical order
				.collect(Collectors.joining()); // Concatenate the result on a single string    	
		System.out.println(result);
	}
}