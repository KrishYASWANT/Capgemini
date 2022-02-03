package Day5.demo;
import java.util.*;

public class StarStringDeletsPreviosAndNextchar {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the text  ");
		String a=sc.next();
		
		char[] arr=a.toCharArray();
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

	}

}
