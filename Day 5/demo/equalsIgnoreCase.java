package Day5.demo;

public class equalsIgnoreCase {

	public static void main(String[] args) {
		String a= "Krish";
		String b= new String("KRISh");
		
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a==b);

	}

}
