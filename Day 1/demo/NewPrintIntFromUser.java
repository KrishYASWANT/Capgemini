package com.demo;

import java.util.Scanner;

public class NewPrintIntFromUser {
	int num()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no  ");
		int num=sc.nextInt();
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewPrintIntFromUser a1=new NewPrintIntFromUser();
		int res=a1.num();
		System.out.println("The number is "+res);

	}

}
