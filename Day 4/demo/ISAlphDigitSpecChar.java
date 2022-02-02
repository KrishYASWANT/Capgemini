package Day4.demo;

import java.util.Scanner;

public class ISAlphDigitSpecChar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a characters");
		char a= sc.next().charAt(0);
		int num=a;
		if((a>='a'&& a<='z')||(a>='A' && a<='Z'))
		{
			System.out.println("Alphabetic Value");
		}
		else if(num>=48 && num <=57)
			System.out.println("Digit");
		else 
			System.out.println("Special character");

	}

}
