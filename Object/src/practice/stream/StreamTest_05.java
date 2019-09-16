package practice.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamTest_05 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum / list.size());
		
		sum = 0;
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			sum += it.next();
		}
		System.out.println(sum / list.size());
		
		System.out.println((int)list.stream().
						mapToInt(Integer::intValue).average().orElse(0));
		
		System.out.println("--------------");
		
		sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		
		sum = 0;
		Iterator<Integer> it_1 = list.iterator();
		while(it_1.hasNext()) {
			sum += it_1.next();
		}
		System.out.println(sum);
		
		sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		System.out.println("--------------");
		
		int max = 0;
		for(int i = 0; i < list.size(); i++) {
			if(max < list.get(i)) {
				max = list.get(i);
			}
		}
		System.out.println(max);
		
		max = 0;
		Iterator<Integer> it_2 = list.iterator();
		while(it_2.hasNext()) {
			int cur = it_2.next();
			if(max < cur) {
				max = cur;
			}
		}
		System.out.println(max);

		max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println(max);
		
		System.out.println("-------------------------");
		
		int min = 1000;
		for(int i = 0; i < list.size(); i++) {
			if(min > list.get(i)) {
				min = list.get(i);
			}
		}
		System.out.println(min);
		
		min = 1000;
		Iterator<Integer> it_3 = list.iterator();
		while(it_3.hasNext()) {
			int cur = it_3.next();
			if(min > cur) {
				min = cur;
			}
		}
		System.out.println(min);
		
		min = list.stream().mapToInt(Integer::intValue).min().orElse(0);
		System.out.println(min);
		
		System.out.println("-------------------");
		
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			count++;
		}
		System.out.println(count);
		
		count = 0;
		Iterator<Integer> it_4 = list.iterator();
		while(it_4.hasNext()) {
			it_4.next();
			count++;
		}
		System.out.println(count);
		
		count = (int)list.stream().count();
		System.out.println(count);
	}
}
