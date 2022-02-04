package Day6.demo;
/*
 * 1. Create class of SalesPersons as a thread that will display    fives sales persons name.
2. Create a class as Days as other Thread that has array of seven days.
3. Call the instance of SalesPersons in Days and start both the 
  threads
4. suspend SalesPersons on Sunday and resume on wednesday. 
Note: use suspend, resume methods from thread

	Multi Threads creation
 */


class SalesPersons extends Thread
{
	
	/*Thread t;
	Salespersons()
	{
		t= new Thread(this,"p.name");
		t.start();
	}*/
	public void run() 
	{
		System.out.println("oggy");
		System.out.println("Jaack");
		System.out.println("Schinchan");
		System.out.println("ninja");
		System.out.println("Rangers");
	}
	
}
class Days extends Thread
{
	public void run()
	{
		String a[]={"Monday","Tuesday","Wednesday","Thusday","Friday","Saturday"};
		SalesPersons obj = null;
		for(int i=0;i<31;i++)
		{
			int j=i%7;
			if(a[j]=="Sunday")
			{
				obj.suspend();
			}else
			{
				if(a[j]=="Wednesday")
				{
					obj.resume();
				}
			}
		}
	}
}


public class SalespersonMultiThread {

	public static void main(String[] args) {
		Thread a = new SalesPersons();
		Thread b=new Days();
		a.start();
		b.start();
	}

}
