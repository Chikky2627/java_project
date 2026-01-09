package com.tnsif.intro.Synchronization;

public class Mythread1 extends Thread  {
	
	   Synchronization t;
	   Mythread1(Synchronization t) {
	        this.t = t;
	    }
	    public void run() {
	        t.printTable(5);
	    }
	}

