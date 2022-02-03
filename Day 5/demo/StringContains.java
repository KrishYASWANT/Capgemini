package Day5.demo;

public class StringContains {

	public static void main(String[] args) {
		String s1= " Imposter ";
		String s2 = "123456";
		String a = "hi";
		String b = "123";
		String s3=" Imposter 123456";
		
		System.out.println(s1.contains(s3));
		System.out.println(s3.contains(s1));
		System.out.println(s3.contains(s2));
		System.out.println(s2.contains(b));
		System.out.println(s3.contains(s2));

	}

}
