package Day5.demo;

public class StringgetChars {

	public static void main(String[] args) {
		String a= "Imposter";
		
		char[] ch = new char[10];
		a.getChars(2, 5, ch, 0);
		System.out.println(ch);

	}

}
