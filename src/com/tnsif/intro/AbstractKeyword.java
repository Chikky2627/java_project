package com.tnsif.intro;

abstract public class AbstractKeyword {//Calculator
     abstract  public void Addition();
     abstract public void Substraction();
}
 class Implementation1 extends AbstractKeyword{
    public void Addition() {
		 final int num1=45;
		 final int num2=87;
		final int result=num1+num2;
		 System.out.println(result);
		
	}

	
	public void Substraction() {
		final int num1=45;
		final int num2=87;
		final int result=num1-num2;
		 System.out.println(result);
		
	}
	public static void main(String[] args) {
		Implementation1 im=new Implementation1();
		im.Addition();
		im.Substraction();
	}
	
}
