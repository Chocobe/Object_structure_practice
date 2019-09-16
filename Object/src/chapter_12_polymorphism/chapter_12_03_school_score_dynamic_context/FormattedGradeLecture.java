package chapter_12_polymorphism.chapter_12_03_school_score_dynamic_context;

import java.util.List;

public class FormattedGradeLecture extends GradeLecture {
// 생성자
	public FormattedGradeLecture(String title, int pass,
					List<Integer> scores, List<Grade> grades) {
		super(title, pass, scores, grades);
	}
	
	
	public String formatAverage() {
		return String.format("Avg: %1.1f", super.average());
	}
}
