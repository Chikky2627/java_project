package com.tnsif.intro.assignments.StreamApi;


	import java.util.ArrayList;
import java.util.List;
	import java.util.stream.Collectors;

	public class Mapping {
	    public static void main(String[] args) {

	        List<Integer> nums =   new ArrayList<>();
	        nums.add(5);
	        nums.add(2);
	        nums.add(9);
	        nums.add(1);
	        nums.add(3);

	        List<Integer> result = nums.stream()
	            .map(n -> n * 2)
	            .collect(Collectors.toList());

	        System.out.println(result);
	    }
	}


