package practice.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamTest_01 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "Java", "Hi", "Stream");
		printLine();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).length());
		}
		
		printLine();
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().length());
		}
		
		printLine();
		
		list.stream().mapToInt(x -> x.length()).forEach(x -> System.out.println(x));
		printLine();
		
		list.stream().mapToInt(String::length).forEach(System.out::println);
	}
	
	private static void printLine() {
		System.out.println("--------------------");
	}
}
