
package Sep22.day1.IntroJava;

import Sep22.day1.IntroJava.PublicPark;
public class MyHome {
	
	private String bed ="queen" ;
	
	public void bedRoom()
	{	
	System.out.println(bed);
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PublicPark Pp=new PublicPark();
		MyHome Mh= new MyHome();
		
		Mh.bedRoom();
		System.out.println(Pp.swing);
		System.out.println(Pp.playground);
		
		

	}

}


