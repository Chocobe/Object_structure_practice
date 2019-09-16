package chapter_12_polymorphism.chapter_12_school_score;

import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		Lecture oop = new Lecture("객체지향 프로그래밍", 70, 
						Arrays.asList(81, 95, 75, 50, 45));
		
		String evaluation = oop.evaluate();
		System.out.println(evaluation);
	}
}
