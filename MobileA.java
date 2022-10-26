package Sep22.day1.IntroJava;

/*
 * 
Assignment 3:
============
1. Create Global Variables with different data types
		mobileModel (with String data type)
		mobileWeight (with int data type)
		isFullCharge (with boolean data type)
		mobileCost (with double datatype)
	- Call all the global variable from main method and print all values in consoles
 
 */

public class MobileA {
	public String mobileModel="iphone11";
	public int mobileWeight=200;
	public boolean isFullCharge=true;
	public double mobileCost=1195.97;
	
	

	public static void main(String[] args) {
	
		MobileA details=new MobileA();
				
		System.out.println("mobileModel: "+details.mobileModel);
		System.out.println("isFullCharge: "+details.isFullCharge);
		System.out.println("mobileCost: "+details.mobileCost);
		System.out.println("mobileWeight: "+details.mobileWeight);
 
		

	}

}
