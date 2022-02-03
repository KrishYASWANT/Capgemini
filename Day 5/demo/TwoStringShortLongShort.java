package Day5.demo;

import java.util.Scanner;

public class TwoStringShortLongShort {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter First String");
		String a = sc.nextLine();
		System.out.println("Enter Secound String");
		String b = sc.nextLine();
		int len1=a.length();
		int len2=b.length();
		char[] ch=a.toCharArray();
		String s="";
		if(len1<len2)
		{
			s=a+b+a;
		}
		else
		{
			s=b+a+a;
		}
		System.out.println(s);
	}

}
