package com.tnsif.intro.Collections.Queue;
import java.util.PriorityQueue;
public class Priority{
	    public static void main(String[] args) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
	        pq.add(30);
	        pq.add(10);
	        pq.add(20);
	        pq.add(5);
            System.out.println("Priority Queue: " + pq);
            System.out.println("Removed: " + pq.remove());
	        System.out.println("Front Element: " + pq.peek());
           System.out.println("Final Queue: " + pq);
	    }
	}


