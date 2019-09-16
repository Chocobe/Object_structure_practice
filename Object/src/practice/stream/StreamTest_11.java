package practice.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest_11 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "World", "Hallo", "Java");
		
		int charCount = list.stream().mapToInt(String::length).sum();
		int count = (int)list.stream().count();
		
		List<Integer> resultList = Arrays.asList(charCount, count);
		resultList.stream().forEach(System.out::println);
	}
}
