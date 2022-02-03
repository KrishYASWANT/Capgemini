package Day5.demo;

public class Stringintern {

	public static void main(String[] args) {
		String a= "Imposter";
		String b = new String("Imposter");
		
		String c = a.intern();
		System.out.println(a==c);
		System.out.println(b==c);
		System.out.println(a==b);

	}

}
