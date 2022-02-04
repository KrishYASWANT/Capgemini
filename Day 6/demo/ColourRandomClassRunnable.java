package Day6.demo;

import java.util.Random;
import java.util.RandomAccess;

/*
 * store colours in the form of an array
ex: String colours[]={"white","blue","black","green","red","yellow"};
display all colours repeatedly by generating colour index from Random class. 
If the random colour index matches to red stop display.
Note: perform this task by implementing Runnabe interface

	Thread creation 
 */
class ColourRandom extends Thread implements Runnable{

	public void run() {
		
		String a[]={"white","blue","black","green","red","yellow"};
		int len= a.length;
		String b;
		Random random= new Random();
		/*String arr= colours.toString();*/
		for(int i=0;i<len;i++)
		{
			int select = random.nextInt(len);
		
		System.out.println("selected"+ a[select]);
		
		if(a[select]== "red")
		{
			break;
		}
		}
		
		
		
	}
	
	
	
}
public class ColourRandomClassRunnable {

	public static void main(String[] args) {
		String colours[]={"white","blue","black","green","red","yellow"};
		
		ColourRandom c= new ColourRandom();
		c.start();
	}

}
