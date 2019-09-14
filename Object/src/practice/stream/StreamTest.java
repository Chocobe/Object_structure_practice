package practice.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamTest {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "Java");
		
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).length());
		}
		
		System.out.println("---");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().length());
		}
		
		System.out.println("---");
		
		list.stream().mapToInt(x -> x.length()).forEach(x -> System.out.println(x));
	}
}
