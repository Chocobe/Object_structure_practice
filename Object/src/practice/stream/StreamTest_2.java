package practice.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamTest_2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "java");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		list.stream().forEach(System.out::println);
	}
}
