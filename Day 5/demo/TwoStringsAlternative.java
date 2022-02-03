package Day5.demo;

import java.util.Scanner;

public class TwoStringsAlternative {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the first String  ");
		String a=sc.next();
		int len1=a.length();
		System.out.println("Enter the Secound String  ");
		String b=sc.next();
		int len2=b.length();
		String s="";
		char ar1[]=a.toCharArray();
		char ar2[]=b.toCharArray();
		for(int i=0;i<len1;i++)
		{
			s=s+ar1[i];
			for(int j=i;j<len2;j++)
			{
				s=s+ar2[j];
				break;
			}
		}
		System.out.println(s);


	}

}
