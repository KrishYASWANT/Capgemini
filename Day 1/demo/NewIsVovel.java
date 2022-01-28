package com.demo;
import java.util.*;

public class NewIsVovel {
	void Isvovel(char ch) 
	{
		//char ch= 'e';
		//Isvovel(char ch)
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
		{
			System.out.println("Vovel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		char ch=sc.next().charAt(0);
		NewIsVovel a1=new NewIsVovel();
		a1.Isvovel(ch);
	}

}
