package Day4.demo;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a= sc.nextInt();
		int temp=a;
		int ans=0;
		while(temp>0)
		{
			ans=ans*10;
			ans=ans+temp%10;
			//Will see it later..............*******************
			temp=temp/10;
		}
		System.out.println(ans);

	}

}
