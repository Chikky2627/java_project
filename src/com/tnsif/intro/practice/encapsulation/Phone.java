package com.tnsif.intro.practice.encapsulation;

public class Phone {
     private int battery;
     public void setbattery(int level) {
    	 if(level>0&&level<=100) {
    		 battery=level;
    		 System.out.println("valid battery level updated :"+battery);
    	 }else System.out.println("invalid battery level");
     }
     public int getbattery() {
    	 return battery;
     }
	public static void main(String[] args) {
		Phone ph=new Phone ();
		ph.setbattery(145);
		//System.out.println(ph.getbattery());

	}

}
