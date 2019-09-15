package practice.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest_7 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int sum = 0;
		int avg = 0;
		int max = 0;
		int min = 0;
		
		sum = list.stream().mapToInt(Integer::intValue).sum();
		avg = (int)list.stream().mapToInt(Integer::intValue).average().orElse(0);
		max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		min = list.stream().mapToInt(Integer::intValue).min().orElse(0);
		
		List<Integer> resultList = Arrays.asList(sum, avg, max, min);
		resultList.stream().mapToInt(Integer::intValue).forEach(System.out::println);
	}
}
