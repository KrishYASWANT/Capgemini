package Day5.demo;
import java.util.*;
/*
 * Given two strings, append them together (known as "concatenation") and return the result.
 *  However, if the concatenation creates a double-char, then omit one of the chars.
 If the inputs are “Mark” and “Kate” then the ouput should be “markate”. (The output should be in lowercase)
 */

public class Append2Strings {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First String");
		String s1= sc.nextLine();
		System.out.println("Enter the Secound String");
		String s2= sc.nextLine();
		String s3="";
		int len1=s1.length();
		char ar= s1.charAt((len1-1));
		int len2=s2.length();
		char ar1=s2.charAt(0);
		if(ar==ar1)
		{
			char[] f=s2.toCharArray();
			for(int i=1;i<len2-1;i++)
			{
				s3=s3+f[i];
			}
		}
		
		/*int a=s1.codePointAt(len1-1);
		System.out.println(s3.concat(s2)); */
		System.out.println(s3);

	}

}
