package Day5.demo;
import java.util.*;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the String  ");
		String s1=sc.nextLine();
		String s2="";
		int len = s1.length();
		for(int i=len-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2))
		{
			System.out.println("The give String is palindrome");
		}
		else
			System.out.println("The give String is not palindrome");
		
	}

}
