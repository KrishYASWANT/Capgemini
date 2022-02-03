package Day5.demo;
import java.util.*;

public class StringNcopiesOFfirst2Char {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a String");
		String a = sc.nextLine();
		int len= a.length();
		
		char[] arr= a.toCharArray();
		String s1="";
		for(int i=0;i<2;i++)
		{
			s1=s1+arr[i];
		}
		for(int i =0;i<len;i++)
		{
			System.out.print(s1);
		}
	}

}
