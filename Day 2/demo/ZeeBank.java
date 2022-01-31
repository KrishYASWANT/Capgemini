package com.demo;
import java.util.*;

class Bank{
	
	int Deposite(int amount,int dep){
		
		amount=amount+dep;
		
		return amount;
	}
	 
	
	
}

public class ZeeBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank a=new Bank();
		long accno=12346789;
		int amount=15000;
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter the amount to be deposited");
		int q=sc.nextInt();
		a.Deposite(amount,q);
		int avabal=amount;
		System.out.println("avalible balance is "+ avabal);
		
		
		
		

	}

}
