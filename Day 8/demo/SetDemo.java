package Day8.demo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

			Set<String> a = new HashSet<String>();
			a.add("HELLO");
			a.add("Imposter");
			a.add("hello");
			a.add("Krish");
			a.add("Krish");
			a.add("Imposter");
			
			System.out.println(a);
	}

}
