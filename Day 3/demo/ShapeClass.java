package Day3.demo;


/* 
 * Write a program to create a class named shape. 
 *  It should contain 2 methods- draw() and erase() which should print “Drawing Shape” and “Erasing Shape” respectively.
For this class we have three sub classes- Circle, Triangle and Square and each class override the parent class functions- draw () and erase (). 
The draw() method should print “Drawing Circle”, “Drawing Triangle”, “Drawing Square” respectively.
The erase() method should print “Erasing Circle”, “Erasing Triangle”, “Erasing Square” respectively.
Create objects of Circle, 
Triangle and Square in the following way and observe the polymorphic nature of the class by calling draw() and erase() method using each object.
Shape c=new Circle();
Shape t=new Triangle();
Shape s=new Square();
 */

class Shape
{
	void Draw() 
	{
		System.out.println("Drawing Shape");
	}
	void Erase() 
	{
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape
{
	public void Draw()
	{
		System.out.println("Drawing Circle");
	}
	
	public void Erase()
	{
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape
{
	public void Draw()
	{
		System.out.println("Drawing Triangle");
	}
	public void Erase()
	{
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape
{
	public void Draw()
	{
		System.out.println("Drawing Square");
	}
	public void Erase()
	{
		System.out.println("Erasing Square");
	}
}

public class ShapeClass {

	public static void main(String[] args) {
		
		Shape c = new Circle();
		c.Draw();
		c.Erase();
		Shape t = new Triangle();
		t.Draw();
		t.Erase();
		Shape s = new Square();
		s.Draw();
		s.Erase();

	}

}
