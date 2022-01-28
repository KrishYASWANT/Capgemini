package com.demo;
import java.util.*;

public class Swap {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(a+"\t"+b);
		
		
	}

}
