package practice.stream;

import java.util.Arrays;
import java.util.List;

public class MyFunctionTest {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "java");
		
		list.stream().mapToInt(MyFunction::getLength).
						forEach(System.out::println);
	}
}
