package com.demo;
import java.lang.Math;

public class Calculator {
	
	int pow(int num1 , int num2)
	{
		int ans = 1,i;
		if(num1==0)
			return 0;
		for(i=0;i<num2;i++)
		{
			ans = num1*ans;
		}
		return ans;
	}
	
	double power(double num1, double num2) {
		double a= Math.pow(num1, num2);
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator a= new Calculator();
		double a1=a.power(5.5, 1.0);
		System.out.println(a1);
		int a2=a.pow(5, 3);
		System.out.println(a2);

	}

}
