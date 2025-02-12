package Number_Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		
		List<Integer> nums1 = Arrays.asList(12,65,34,17,48,69,58,35,86,43,75,95,62,43,12,35,17,16,73);
		
		
		//Given a list of integers, find out all the even numbers that exist in the list using Stream functions and sort them
		nums1.stream().filter(n -> n%2 ==0).map(n -> n+" ").sorted().forEach(System.out::print);
		
		System.out.println();
		
		//Given a list of integers, find out all the numbers starting with 1 using Stream functions
		nums1.stream().sorted().map(s -> s+" ").filter( s-> s.startsWith("1")).forEach(System.out::print);
		
		System.out.println();
		
		//How to find duplicate elements in a given integers list in java using Stream functions?
		Set<Integer> result = new HashSet<>();
		nums1.stream().filter(s -> !result.add(s)).map(s ->s +" ").forEach(System.out::print);
		
		System.out.println();
		
		//Given the list of integers, find the first element of the list using Stream functions
		nums1.stream().findFirst().ifPresent(System.out::print);
		
		System.out.println();
		
		//Given a list of integers, find the total number of elements present in the list using Stream functions
		long count = nums1.stream().count();
		System.out.println(count);

		
		//Given a list of integers, find the maximum value element present in it using Stream functions
		long max = nums1.stream().max(Integer::compare).get();
		System.out.println(max);
		
		//Given a list of integers, sort all the values present in it using Stream functions
		nums1.stream().sorted().map(s -> s+ " ").forEach(System.out::print);
		
		System.out.println();
		
		//Given a list of integers, sort all the values present in it in descending order using Stream functions
		nums1.stream().sorted(Collections.reverseOrder()).map(s -> s+" ").forEach(System.out::print);
		
		System.out.println();
		
		//Java 8 program to perform cube on list elements and filter numbers greater than 50
		 
		
		
		
		
	}

}
