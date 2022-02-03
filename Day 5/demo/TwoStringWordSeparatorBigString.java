package Day5.demo;

import java.util.Scanner;

public class TwoStringWordSeparatorBigString {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter  String");
		String a = sc.nextLine();
		System.out.println("Enter  Separator");
		String b = sc.nextLine();
		int len1=a.length();
		//int len2=b.length();
		char[] ch=a.toCharArray();
		String s="";int count=sc.nextInt();
		if(count==1)
		{
			s=s+a;
		}else 
		{
			s=s+a;
		for(int i=0;i<count-1;i++)
		{
			s=s+b;
			s=s+a;
			
		}
		}
		System.out.println(s);
	}

}
