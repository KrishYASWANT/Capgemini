package com.demo;

public class Constructors {
	
	Constructors(int n,int n1)
	{
		int res=n*n1;
		System.out.println("The result of the problem is "+ res);
			
	}
	
	Constructors()
	{
			System.out.println("This is the area of the rectangle");
		
	}
	
	String Namedemo(String name)
	{
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors constructors= new Constructors(4,5);
		Constructors c= new Constructors();
		String hi=c.Namedemo("Imposter");
		System.out.println("hi bro my name is  "+hi);
		

	}

}
