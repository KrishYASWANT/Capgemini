package Day4.demo;

import java.util.Scanner;

public class FloydsStarsprg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a= sc.nextInt();
		a++;
		for(int i =0;i<a;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
