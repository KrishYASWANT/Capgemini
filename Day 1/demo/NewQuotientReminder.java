package com.demo;
import java.util.*;

class Cal
{
	int Quotient(int a,int b)
	{
			int res=a%b;
			return res;
	}
	int Reminder(int a,int b)
	{
			int res=a/b;
			return res;
	}
}
	
public class NewQuotientReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Cal a1=new Cal();
		int ans1=a1.Quotient(a, b);
		int ans2=a1.Reminder(a, b);
		
		System.out.println("Quotient and Reminder are "+ ans1+"\t"+ans2);

	}

}
