package Number_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
		
		int[] arr = {1,2,3,4,5};
		Set<Integer> s1 = new HashSet<>();
		System.out.println(Arrays.stream(arr)  // converts array into stream
								 .anyMatch(s -> !s1.add(s)));
		

	}

}
