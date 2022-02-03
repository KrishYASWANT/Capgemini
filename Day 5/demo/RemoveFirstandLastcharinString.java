package Day5.demo;

import java.util.Scanner;

public class RemoveFirstandLastcharinString {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a String");
		String a = sc.nextLine();
		int len=a.length();
		char[] ch=a.toCharArray();
		String s="";
		
		for(int i =1;i<len-1;i++)
		{
			s=s+ch[i];
		}
		System.out.println(s);
	}

}
