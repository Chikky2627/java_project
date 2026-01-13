package com.tnsif.intro.Collections.Hashset;
import java.util.Set;
import java.util.LinkedHashSet;
public class TicketNumbers {
    public static void main(String[] args) {
		Set<Integer> numbers=new LinkedHashSet<>();
        numbers.add(100600433);
        numbers.add(100600434);
        numbers.add(100600435);
        numbers.add(100600436);
        System.out.println(numbers);
	}

}
