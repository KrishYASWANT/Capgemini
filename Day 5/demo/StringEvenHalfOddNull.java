package Day5.demo;

import java.util.Scanner;

public class StringEvenHalfOddNull {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a String");
		String a = sc.nextLine();
		int len= a.length();
		
		char[ ] ch=a.toCharArray();
		String s="";
		if(len%2==0)
		{
			for(int i=0;i<(len)/2;i++)
			{
				s=s+ch[i];
			}
		}
		else
			s="null";
		
		System.out.println(s);

	}

}
