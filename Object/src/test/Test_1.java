package test;

import java.util.Arrays;
import java.util.List;

public class Test_1 {
	private static List<String> list;
	
	
	public static void init(String ...str) {
		list = Arrays.asList(str);
	}
	
	
	public static void printAll() {
		list.stream().forEach((String str) -> System.out.println("출력 : " + str));
	}
	
	
	public static void main(String[] args) {
		init("Hello", "Hi", "Java", "World");
		printAll();
	}
}
