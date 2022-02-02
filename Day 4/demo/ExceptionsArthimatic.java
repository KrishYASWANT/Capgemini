package Day4.demo;

public class ExceptionsArthimatic {
		
	
	public static void main(String ar[]) {

		int number = 10;
		int b = 0;

		try {
			int temp = number / b;//match the exception as  per logic
			System.out.println(temp);
		} catch (ArithmeticException e) {

			System.out.println(" caused due to divide by zero  " + e);

		}

		System.out.println("ended");

	}
}
