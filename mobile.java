/*Assignment 11:
===========================
Avneet Kaur
Create package name as week1.day1
Create a new class as "mobile" under week1.day1
Create 2methods (makeCall(), sendMsg() with simple print statement
Create main method
Create object for Mobile class and call the methods using the object
Execute the class and get the result in the console
*/



package week1.day1;

public class mobile {

	public static void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("makeCall");

	}

	public static void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("Send Message");

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 	
		//new object creation -> class objectname = new class()
		mobile nokia=new mobile();
		// for calling method 'makeCall' for object 'nokia'-> object.method();
		nokia.makeCall();
		
		nokia.sendMsg();
		
		
		
	}


	

}
