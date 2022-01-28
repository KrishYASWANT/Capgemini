package com.demo;

import java.util.Scanner;

public class NewAscii {
	int value(char c) 
	{
		int val= c;
		return val;
		//
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println( "Enter a char ");
		char ch=sc.next().charAt(0);
		NewAscii a1=new NewAscii();
		int res=a1.value(ch);
		System.out.println( "Ascii value is " + res);

	}

}
