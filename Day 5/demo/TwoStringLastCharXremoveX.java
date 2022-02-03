package Day5.demo;

import java.util.Scanner;

public class TwoStringLastCharXremoveX {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter First String");
		String a = sc.nextLine();
		int len1=a.length();
		char[] ch=a.toCharArray();
		String s="";
		if((a.charAt(0)=='x')&&(a.charAt(len1-1)=='x'))
		{
			for(int i=1;i<len1-1;i++)
			{
				s=s+ch[i];
			}
			System.out.println(s);
		}
		else
			System.out.println(a);
		
		

	}

}
