package practice.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamTest_3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "java");
		
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i).length();
		}
		System.out.println(sum);
		
		sum = 0;
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			sum += it.next().length();
		}
		System.out.println(sum);
		
		System.out.println(
				list.stream().mapToInt(String::length).sum());
	}
}
