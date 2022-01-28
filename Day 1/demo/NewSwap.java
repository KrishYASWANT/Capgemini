package com.demo;
import java.util.*;

public class NewSwap {
	void Swap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first no  ");
		int num=sc.nextInt();
		System.out.println("enter secound no   ");
		int num1 =sc.nextInt();
		int temp;
		temp=num;
		num=num1;
		num1=temp;
		System.out.println("Swaped numbers are"+num +" " + num1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewSwap a1=new NewSwap();
		a1.Swap();
				

	}

}
