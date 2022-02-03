package Day5.demo;

public class Stringjoin {

	public static void main(String[] args) {
		String s1= "Imposter";
		String s2 ="He is an";
		
		s2.join("hi", "hello");
		System.out.println(s2.join(s1, args));
		String s3 = String.join(s2, "man");
		System.out.println(s2);
		System.out.println(s3);
	}

}
