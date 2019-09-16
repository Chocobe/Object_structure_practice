package practice.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest_06 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		int sum;
		int avg;
		int max;
		int min;
		
		sum = list.stream().mapToInt(Integer::intValue).sum();
		avg = (int)list.stream().mapToInt(Integer::intValue).average().orElse(0);
		max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		min = list.stream().mapToInt(Integer::intValue).min().orElse(0);
		
		List<Integer> result = Arrays.asList(sum, avg, max, min);
		result.stream().forEach(System.out::println);
	}
}
