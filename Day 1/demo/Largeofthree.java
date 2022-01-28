package com.demo;
import java.util.*;
public class Largeofthree {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int temp,large;
		
		temp=a>b?a:b;
		large=c>temp?c:temp;
		
		System.out.println("the largest number is "+ large);
		
		
		
	}

}
