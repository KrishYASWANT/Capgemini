package Day3.demo;

//overload using methods
class Circle1 
{

	void Area(double radius) {

		double result = 3.17 * radius;
		System.out.println(result);
	}

	// return type
	double Area(double lenght, double breadth) {

		double result = lenght * breadth;
		return result;
	}

}

public class MethodOverloadingDemo {

	public static void main(String ar[]) {

		Circle1 c = new Circle1();
		c.Area(12.1);

		double temp = c.Area(12, 45);

		System.out.println(temp);

	}
}
