package Day6.demo;
/*
 *  Create three threads- with different priorities – MAX, MIN, NORM- and start the threads at the same time. 
 *  Observe the completion of the threads.
 */

class Scoobydoo extends Thread{
	
	public void run() {
		
		System.out.println("hi i am Scooby is first ");
		
	}
	
}public class ThreadPriority {

	public static void main(String[] args) {
		
		Thread a= new Scoobydoo();
		Thread b= new Scooby();
		Thread c= new Shaggy();

		System.out.println("Priority of Thread a is : " + a.getPriority());
		System.out.println("Priority of Thread b is : " + a.getPriority());
		System.out.println("Priority of Thread c is : " + a.getPriority());
		
		a.setPriority(6);
		a.start();
		b.setPriority(3);
		b.start();
		c.setPriority(9);
		c.start();
		
	}

}
