package Day6.demo;
/*
 * create two threads, one thread to display all even numbers between 1 & 20, another to display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers
Hint: use join
 */
class Even extends Thread
{
	public void run()
	{
		
		for(int i =1;i<=20;i++)
		{
			
			if(i%2==0)
					System.out.print(i +" ");	
		}
	}
	
}
class Odd extends Thread
{
	public void run()
	{
		
		for(int i =1;i<=20;i++)
		{
			
			if(i%2!=0)
					System.out.print(i +" ");	
		}
	}
	
}
public class EvenoddThreadwithjoin {

	public static void main(String[] args) {
		Thread a= new Even();
		a.start();
		try {
			a.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		Thread o= new Odd();
		o.start();
	}

}
