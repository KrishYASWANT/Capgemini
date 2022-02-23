package Day11.demo;

import java.util.stream.Stream;

public class StreamsOfArray {

	public static void main(String[] args) {

		Stream<Integer> a= Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9,0});
		
		a.forEach(p-> System.out.println(p));
		
		
		
		
		
	}

}
