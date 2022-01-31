package com.demo;

class ModifierDemo {
	
	void Hello() {
		System.out.println("hello how are you ");
	}
	public void Hi() {
		System.out.println("hi guys ");
		
	}
	private String Name(String na) {
		System.out.println("hi my name is Krish ");
		return na;
		
	}
}

public class Modifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModifierDemo a1=new ModifierDemo();
		a1.Hello();
		a1.Hi();
		//a1.Name();
		

	}

}
