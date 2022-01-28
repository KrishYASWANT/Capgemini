package com.demo;
import java.util.*;
public class EverOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a= sc.nextInt();
		
		if(a%2==0) 
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}

	}

}
