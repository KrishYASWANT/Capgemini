package Day4.demo;

import java.util.Scanner;
/* Write a program that displays a menu with options 1. Add 2. Sub
Based on the options chosen, read 2 numbers and perform the relevant operation. After performing the operation, 
the program should ask the user if he wants to continue. If the user presses y or Y, 
then the program should continue displaying the menu else the program should terminate.
[ Note: Use Scanner class, you can take help from the trainer regarding the same ]
*/

class Menu
{
	void a(int a,int b,String something )
	{
		switch(something)
		{
		case "Add" :
		{
			int res=a+b;
			System.out.println(res);
			break;
		}
		case "Sub" :
		{
			int res=a-b;
			System.out.println(res);
			break;
		}
			
		}
	}
	
}

class Display
{
	void show()
	{
	Menu m = new Menu();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 2 numbers ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("1. Add ");
	System.out.println("1. Sub ");
	System.out.println("Enter ur choice ");
	String something =sc.next();
	m.a(a,b,something);
}
}
public class DisplayMenuAddetc {

	public static void main(String[] args) {
		Menu m = new Menu();
		Scanner sc= new Scanner(System.in);
		/*System.out.println("Enter 2 numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("1. Add ");
		System.out.println("1. Sub ");
		System.out.println("Enter ur choice ");
		String something =sc.next();
		m.a(a,b,something);
				*/
		/*do {
			Display display = new Display();
			display.show();
		}*/	
		Display play = new Display();
		play.show();
		System.out.println("do you want to continue : press Y or y");
		String user=sc.next();
				
		switch(user)
		{
			case "y":
			{
				Display display = new Display();
				display.show();
				break;
			}
			case "Y":
			{
				Display display = new Display();
				display.show();
				break;
			}
			default:
			{
				System.out.println("End of prog");
				break;
			}
		}
		
	}
}
