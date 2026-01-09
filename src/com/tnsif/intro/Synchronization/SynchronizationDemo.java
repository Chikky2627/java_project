package com.tnsif.intro.Synchronization;

public class SynchronizationDemo {
	
	    public static void main(String[] args) {
	    	Synchronization obj = new Synchronization(); // single object

	        Mythread1 t1 = new Mythread1(obj);
	        Mythread1 t2 = new Mythread1(obj);

	        t1.start();
	        t2.start();
	    }
	}

