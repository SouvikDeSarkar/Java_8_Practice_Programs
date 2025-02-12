package String_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {
		
		String str = "Java articles are Awesome";
		System.out.println(str.indexOf('a'));
		
		//Given a String, find the first non-repeated character in it using Stream functions?
		Character result = str.chars()
								.mapToObj(s -> (char) s) //converting string into stream of characters
								.filter(s -> str.indexOf(s) == str.lastIndexOf(s)) // checks each character and filters the non-repeated
								.findFirst().orElse(null);
		System.out.println(result);
		
		
		//Given a String, find the first repeated character in it using Stream functions
		Character result1 = str.chars()
				.mapToObj(s -> (char) s) //converting string into stream of characters
				.filter(s -> str.indexOf(s) != str.lastIndexOf(s)) // checks each character and filters the repeated
				.findFirst().orElse(null);
		System.out.println(result1);
		
		//Alternative
		
		Set<Character> s = new HashSet<>();
		Character c = str.chars() 
				.mapToObj(a -> (char) a)
				.filter( a -> !s.add(a)) // checks each character and filters the repeated
				.findFirst().orElse(null);
		System.out.println(c);
		
		//Write a Java 8 program to concatenate two Streams?
		String str1 = " This is a pratice program";
		
		List<String> l1 = Arrays.asList(str);
		List<String> l2 = Arrays.asList(str1);
		
		Stream.concat(l1.stream(), l2.stream()).forEach(System.out::print);
		
		System.out.println();
		
		//   
		
		
		
	}

}
