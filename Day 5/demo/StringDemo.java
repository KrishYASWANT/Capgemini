package Day5.demo;

public class StringDemo {

	public static void main(String[] args) {
		String s1="Raju";
		String s2="Raju";
		String s3= new String("Raju");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		if(s2.equals(s3))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
		
	}

}
