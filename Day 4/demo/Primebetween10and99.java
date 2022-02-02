package Day4.demo;

import java.util.Scanner;

public class Primebetween10and99 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a number");
		//int a= sc.nextInt();
		int c=0;
		for(int i=10;i<99;i++)
		{
			if(i%(i/2)==0)
			{
				//c++;
				//System.out.println("");
			}
			else
				System.out.print(i+ " ");
		}
	}

}
