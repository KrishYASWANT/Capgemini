package Day4.demo;
import java.util.*;

public class AlphabeticOrder {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 characters");
		char a= sc.next().charAt(0);
		char b= sc.next().charAt(0);
		
		int num1=b;
		int num2=a;
		if(num2<num1)
		{
			System.out.println(a+" " + b);
		}
		else
			System.out.println(b+" " + a);
		

	}

}
