package Day6.demo;

/*
 * Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. 
 * Display both thread names.

	Setting the name of the thread. 	

 */


class Scooby extends Thread{
	
	public void run() {
		
		System.out.println("hi i am Scooby boooow ");
		
	}
	
}
class Shaggy extends Thread{
	
	public void run()
	{
		System.out.println("hi i am Shaggy , i am scared");
	}
}

public class ScoobyShaggydoooThreat {

	public static void main(String[] args) {
		
		Thread s=new Scooby();
		Thread s1= new Shaggy();
		s.start();
		s1.start();
		
		
	}

}
