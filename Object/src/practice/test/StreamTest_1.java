package practice.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamTest_1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		list.stream().forEach(x -> System.out.println(x));
		
		int avg = (int)list.stream().mapToInt(x -> x.intValue()).average().orElse(0);
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("avg : " + avg);
		System.out.println("sum : " + sum);
	}
}
