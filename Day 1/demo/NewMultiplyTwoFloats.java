package com.demo;

import java.util.Scanner;

public class NewMultiplyTwoFloats {
	float Mul()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 floats");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=a*b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewMultiplyTwoFloats a1= new NewMultiplyTwoFloats();
		float ans=a1.Mul();
		System.out.println("The product of two floats are "+ans);

	}

}
