package Sep22.day1.IntroJava;

public class Car {

	public void applyBrake()
	{
		System.out.print("Apply Brakes");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object 
      Car Toyota = new Car();
      Car Honda= new Car();

      Honda.applyBrake();
	}

}
