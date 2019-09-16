package chapter_12_polymorphism.chapter_12_school_score_origin;

import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		Lecture oop_1 = new Lecture("객체지향 프로그래밍", 70, 
						Arrays.asList(81, 95, 75, 50, 45));
		
		String evaluation_1 = oop_1.evaluate();
		System.out.println(evaluation_1);
		
		Lecture oop_2 = new GradeLecture(
						"객체지향 프로그래밍", 
						70,
						Arrays.asList(81, 95, 75, 50, 45), 
						Arrays.asList(
								new Grade("A", 100, 95),
								new Grade("B", 94, 80),
								new Grade("C", 79, 70),
								new Grade("D", 69, 50),
								new Grade("F", 49, 0)));
		
		String evaluation_2 = oop_2.evaluate();
		System.out.println(evaluation_2);
		
		GradeLecture test = (GradeLecture)oop_2;
		double result = test.average("A");
		System.out.println("평균 : " + result);
	}
}
