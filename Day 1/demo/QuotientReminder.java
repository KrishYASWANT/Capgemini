package com.demo;
import java.util.*;

public class QuotientReminder {
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Quotient"+ a/b);
		System.out.println("Reminder"+ a%b);
		
	}

}
