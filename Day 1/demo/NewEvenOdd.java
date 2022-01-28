package com.demo;
import java.util.*;
class EvenOdd
{
	String Even()
	{
		Scanner sc=new Scanner(System.in);
		String x,y;
		System.out.println("Enter a number");
		int a= sc.nextInt();
		
		if(a%2==0) 
		{
			x = "Even";
		}
		else
		{
			x="Odd";
		}
		return x;
	}
}

public class NewEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd a1= new EvenOdd();
		String re = a1.Even();
		System.out.println("numbers is an "+re);
	}

}
