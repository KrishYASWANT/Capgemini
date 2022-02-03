package Day5.demo;

import java.util.Scanner;
/*
 *  Given a string and a non-empty word string, 
 *  return a string made of each char just before and just after every appearance of the word in the string. 
Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

If inputs are "abcXY123XYijk" and "XY", output should be "c13i".
If inputs are "XY123XY" and "XY", output should be "13".
If inputs are "XY1XY" and "XY", output should be "11".
 */

public final class TwoStringWordSeparatorRemoveadjacentchar {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the text  ");
		String a=sc.next();
		System.out.println("Enter the Seperator  ");
		String b=sc.next();
		
		  int len1 = a.length();
		  int len2 = b.length();
		  String fin = "";
		  
		  for (int i = 0; i < len1-len2+1; i++) { 
		    String tmp = a.substring(i,i+len2);
		    if (i > 0 && tmp.equals(b))
		      fin += a.substring(i-1,i);
		    if (i < len1-len2 && tmp.equals(b))
		      fin += a.substring(i+len2,i+len2+1);
		  }
		  System.out.println(fin); 

		/*char[] arr=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			if(arr[i]=='*' && i!=0)
			{
				if(arr[i-1]!='*')
				{
					arr[i-1]= ' ' ;
				}
				if(arr[i+1]!='*')
				{
					arr[i+1]= ' ' ;
				}
				arr[i]=' ';
			}
		}
		for(int i=0;i<a.length();i++)
		{
			System.out.print(arr[i]);
		}

	}*/

	}

}
