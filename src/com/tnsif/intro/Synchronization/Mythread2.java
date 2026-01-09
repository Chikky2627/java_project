package com.tnsif.intro.Synchronization;

public class Mythread2 extends Thread {
	 
	Synchronization t;
	     Mythread2(Synchronization t) {
	        this.t = t;
	    }
	    public void run() {
	        t.printTable(10);
	    }
	}

