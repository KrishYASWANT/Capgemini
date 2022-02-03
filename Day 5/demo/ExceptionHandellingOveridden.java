package Day5.demo;

public class ExceptionHandellingOveridden {

	public static void main(String ar[]) {

		try {
              /// 1th
			try {
				System.out.println("going to divide by 0");
				int b = 39 / 0;

			} catch (ArithmeticException e) {
			} // closed here
			
			
			//2and
			try {
				
			} catch (ArrayIndexOutOfBoundsException e) {
			} // closed here
			

		} catch (Exception e) {
			
			System.out.println("handled all exceptions wih trys");
		} // closed here
	}

}