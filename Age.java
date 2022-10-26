package Sep22.day1.IntroJava;

/*Assignment 4:
==============
main method
int age=40;

if(age <18)
print child
else if (age >= 18 && age <60)
print adult
else
print senior*/

public class Age {

	public static void main(String[] args) {
		
		int age = 40;
		if(age<18)
			System.out.println("Child");
		else if(age >=18 && age<60)
			System.out.println("adult");
		else
			System.out.println("Senior");
			
		
	}

}
