package Day5.demo;

public class StringEndsWith {

	public static void main(String[] args) {
		String s1= "Hello World ";
		String s2="d";
		String s3="z";
		String a=" ";
		String b="World ";
		System.out.println( s1.endsWith(s2));
		System.out.println( s1.endsWith(s3));
		System.out.println( s1.endsWith(a));
		System.out.println( s1.endsWith(b));

	}

}
