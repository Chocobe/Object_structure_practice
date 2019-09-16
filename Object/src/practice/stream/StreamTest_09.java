package practice.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest_09 {
	public static void main(String[] args) {
		List<String> listStr = Arrays.asList("Hello", "Java", "Hi", "World");
		
		int len = listStr.stream().mapToInt(String::length).sum();
		System.out.println(len);
		
		List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println();
		
		int sum = listInt.stream().mapToInt(Integer::intValue).sum();
		int avg = (int)listInt.stream().mapToInt(Integer::intValue).average().orElse(0);
		int max = listInt.stream().mapToInt(Integer::intValue).max().orElse(0);
		int min = listInt.stream().mapToInt(Integer::intValue).min().orElse(0);
		
		List<Integer> resultList = Arrays.asList(sum, avg, max, min);
		resultList.stream().forEach(System.out::println);
	}
}
