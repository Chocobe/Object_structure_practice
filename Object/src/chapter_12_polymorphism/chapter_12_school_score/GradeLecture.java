package chapter_12_polymorphism.chapter_12_school_score;

import java.util.List;

public class GradeLecture extends Lecture {
	private List<Grade> grades;
	
	
// 생성자
	public GradeLecture(String title, int pass, 
					List<Integer> scores, List<Grade> grades) {
		super(title, pass, scores);
		this.grades = grades;
	}
}
