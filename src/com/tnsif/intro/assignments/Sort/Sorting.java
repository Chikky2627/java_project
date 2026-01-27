package com.tnsif.intro.assignments.Sort;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
    	List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(2);
        nums.add(9);
        nums.add(1);
        nums.add(3);
        List<Integer> sortedList = nums.stream()
            .sorted()
            .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
