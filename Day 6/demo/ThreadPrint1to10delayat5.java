package Day6.demo;


class Delay extends Thread
{
	public void run()
	{
		
		for(int i =1;i<=10;i++)
		{
			System.out.print(i +" ");
			if(i==5)
			{
				try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println(e);
			
				
			}
				
		}
	}

	
		
	}
	
}
public class ThreadPrint1to10delayat5 {

	public static void main(String[] args) {
		Thread a= new Delay();
		a.start();

	}

}
