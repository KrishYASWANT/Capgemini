package com.demo;
import java.util.*;

public class NumerologyNo {
	
	long sum(long num){
		long add = 0;
		while(num>0)
		{
			add=add+num%10;
			
			num=num/10;
		}
		return add;
		
	}
	long numerno(long q)
	{
		long add = 0;
		while(q>0)
		{
			add=add+q%10;
			
			q=q/10;
		}
		if(add==10)
			return 1;
		return add;

	}
	long odd(long num)
	{
		long add,count=0;
		while(num>0)
		{
			add=num%10;
			if((add%2) != 0)
			{
				count++;
			}
			num=num/10;
		}
		return count;
		
	}
	long even(long num)
	{
		long add,count=0;
		while(num>0)
		{
			add=num%10;
			if((add%2) == 0)
			{
				count++;
			}
			num=num/10;
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		long num= sc.nextLong();
		NumerologyNo a= new NumerologyNo();
		long q=a.sum(num);
		System.out.println("Sum of numbers :" + q);
		long Nno=a.numerno(q);
		System.out.println("NumerologyNo :" + Nno);
		long ODD=a.odd(num);
		System.out.println("Number of odd numbers are :" + ODD);
		long EVEN=a.even(num);
		System.out.println("Number of odd numbers are :" + EVEN);

		
	}

}
