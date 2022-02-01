package Day3.demo;

/*Create  a base class Fruit which has name ,taste and size as its attributes. 
A method called eat() is created which describes the name of the fruit and its taste.  
Inherit the same in 2 other class Apple and Orange and override the eat() method 
to represent each fruit taste.*/
class Fruit
{
	void name()
	{
		System.out.println("Fruit name is ");
	}
	void taste()
	{
		System.out.println("Fruit taste is ");
	}
	void size()
	{
		System.out.println("Fruit size is ");
	}
	void eat()
	{
		System.out.println("fruit is eatable");
	}
}
class Apple extends Fruit
{
	public void eat() {
			System.out.println("Name of the fruit is APPLE and it Tasts SWEET");
	}
}
class Orange extends Fruit
{
	public void eat() {
		System.out.println("Name of the fruit is ORANGE and it Tasts TANGY");
}
}
public class FruitClass {

	public static void main(String[] args) 
	{
		
		Fruit fruit= new Apple();
		fruit.eat();

	}

}
