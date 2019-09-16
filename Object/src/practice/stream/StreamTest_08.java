package practice.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest_08 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "World", "Java");
		
		list.stream().map(x -> x + "!").forEach(System.out::println);
		System.out.println();
		
		list.stream().mapToInt(String::length).forEach(System.out::println);
		System.out.println();
		
		System.out.println(list.stream().mapToInt(String::length).sum());
	}
}
