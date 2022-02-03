package Day5.demo;

public class StringFormat {

	public static void main(String[] args) {
		String a= "Krish";
		String b= new String("KRISh");
		String q = String.format("Name is %s" , a);
		
		String s1=String.format(null, a, args);
		
		System.out.println(a.format(a, args));
		System.out.println(s1);
		System.out.println(q);

	}

}
