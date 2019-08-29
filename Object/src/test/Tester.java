package test;

import java.util.Arrays;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		Integer[] arr = { -2, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(arr);
		
		boolean result = false;
		
		result = list.stream().anyMatch(val -> val.equals(3));
		System.out.println("list에 3이 있다? : " + result);
		
		result = list.stream().allMatch(val -> val.equals(3));
		System.out.println("list에 모두 3이 있다? : " + result);
		
		result = list.stream().noneMatch(val -> val.equals(3));
		System.out.println("list에 3은 없다? : " + result);
		
		
		System.out.println("--------------------------");
		
		
		String[] stringArr = { "Hello", "Java", "Hi", "World" };
		List<String> stringList = Arrays.asList(stringArr);
		
		System.out.println(stringList.stream().anyMatch(string -> string.contains("Hell")));
		
		System.out.println(stringList.stream().allMatch(string -> string.contains("Hell")));
		
		System.out.println(stringList.stream().noneMatch(string -> string.contains("Hells")));
		
		Long[] longArr = { 2L };
		List<Long> longList = Arrays.asList(longArr);
		
		System.out.println(longList.stream().anyMatch(val -> val.equals(1L)));
		System.out.println(longList.stream().allMatch(val -> val.equals(1L)));
		System.out.println(longList.stream().noneMatch(val -> val.equals(1L)));
	}
}
