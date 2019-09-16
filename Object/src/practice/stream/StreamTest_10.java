package practice.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest_10 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		int min = list.stream().mapToInt(Integer::intValue).min().orElse(0);
		int avg = (int)list.stream().mapToInt(Integer::intValue).average().orElse(0);
		
		List<Integer> resultList = Arrays.asList(sum, max, min, avg);
		
		list.stream().forEach(System.out::println);
		System.out.println();
		resultList.stream().forEach(System.out::println);
	}
}
