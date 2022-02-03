package Day5.demo;

import java.util.Scanner;

public class StringNRepetationofNchar {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the first String  ");
		String a=sc.next();
		System.out.println("Enter a NUmber  ");
		int x=sc.nextInt();
		String s="";
		char arr[]=a.toCharArray();
		for(int i=x-1;i<a.length();i++)
		{
			s=s+arr[i];
		}
		String s1=s;
		for(int i=0;i<x-1;i++)
		{
			s1=s1+s;
		}
		System.out.println(s1);

	}

}
