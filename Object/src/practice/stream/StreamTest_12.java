package practice.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest_12 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream().forEach(System.out::println);
		
		System.out.println();
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		int min = list.stream().mapToInt(Integer::intValue).min().orElse(0);
		int avg = (int)list.stream().mapToInt(Integer::intValue).average().orElse(0);
		
		List<Integer> result = Arrays.asList(sum, max, min, avg);
		result.stream().forEach(System.out::println);
	}
}
