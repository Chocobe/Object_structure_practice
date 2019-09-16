package chapter_12_polymorphism.chapter_12_03_school_score_dynamic_context;

import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		// Lecture 테스트
		Lecture oop_1 = new Lecture("객체지향 프로그래밍", 70, 
						Arrays.asList(81, 95, 75, 50, 45));
		
		String evaluation_1 = oop_1.evaluate();
		System.out.println(evaluation_1);
		
		// GradeLecture 테스트
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
		
		// Professor(in Lecture) 테스트
		Professor professor_1 = new Professor("다익스트라",
						new Lecture("알고리즘",
								70,
								Arrays.asList(81, 95, 75, 50, 45)));
		
		String statistics_1 = professor_1.compileStatistics();
		System.out.println(statistics_1);
		
		// Professor(in GradeLecture) 테스트
		Professor professor_2 = new Professor("다익스트라", 
						new GradeLecture(
								"알고리즘",
								70, 
								Arrays.asList(81, 95, 75, 50, 45),
								Arrays.asList(
										new Grade("A", 100, 95),
										new Grade("B", 94, 80),
										new Grade("C", 79, 70),
										new Grade("D", 69, 50),
										new Grade("F", 49, 0))));
		String statistics_2 = professor_2.compileStatistics();
		System.out.println(statistics_2);
	}
}
