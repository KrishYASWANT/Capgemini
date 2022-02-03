package Day5.demo;

public class StringgetBytes {

	public static void main(String[] args) {
		String a= "ABCDE";
		System.out.println(a.getBytes());
		System.out.println(a.getBytes());
		
		byte[] z=a.getBytes();
		for(int i=0;i<z.length;i++)
		{
			System.out.println(z[i]);
		}

	}

}
