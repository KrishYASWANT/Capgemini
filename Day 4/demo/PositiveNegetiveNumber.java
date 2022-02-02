package Day4.demo;
import java.util.*;

public class PositiveNegetiveNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		if(n>0)
		{
			System.out.println("number is positive");
		}
		else if(n<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is Zero");
		}

	}

}
