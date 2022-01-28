package com.demo;
import java.util.*;

class Add
{
	int AddingNumber()
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter first no");
	int num=sc.nextInt();
	System.out.println("enter secound no");
	int num1 =sc.nextInt();
	int result = num+num1;
	return result;
	}
}
public class NewAddTWO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a1= new Add();
		int result=a1.AddingNumber();
		System.out.println("sum of numbers are "+result);

	}

}
