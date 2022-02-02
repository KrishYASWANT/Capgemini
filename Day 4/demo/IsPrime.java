package Day4.demo;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a= sc.nextInt();
		int c=0;
		for(int i=2;i<(a/2);i++)
		{
			if(a%i==0)
			{
				c++;
			}
		}
		if(c==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

}
