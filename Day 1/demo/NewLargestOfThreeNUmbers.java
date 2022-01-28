package com.demo;

import java.util.Scanner;

public class NewLargestOfThreeNUmbers {
	int large()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int temp,large;
		
		temp=a>b?a:b;
		large=c>temp?c:temp;
		return large;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewLargestOfThreeNUmbers a1=new NewLargestOfThreeNUmbers();
		int res=a1.large();
		System.out.println("The largest amoung 3 numbers is	"+res);

	}

}
