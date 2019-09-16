package chapter_12_polymorphism.chapter_12_03_school_score_dynamic_context;

import java.util.List;
import static java.util.stream.Collectors.joining;

public class GradeLecture extends Lecture {
	private List<Grade> grades;
	
	
// 생성자
	public GradeLecture(String title, int pass, 
					List<Integer> scores, List<Grade> grades) {
		super(title, pass, scores);
		this.grades = grades;
	}
	
	
	public double average(String gradeName) {
		return grades.stream().
						filter(each -> each.isName(gradeName)).
						findFirst().
						map(this::gradeAverage).
						orElse(0d);
	}
	
	
	private double gradeAverage(Grade grade) {
		return getScores().stream().
						filter(grade::include).
						mapToInt(Integer::intValue).
						average().
						orElse(0);
	}
	
	
	@Override
	public String evaluate() {
		return super.evaluate() + ", " + gradesStatistics();
	}
	
	
	private String gradesStatistics() {
		return grades.stream().
						map(grade -> format(grade)).
						collect(joining(" ")); // import static ... 사용
	}
	
	
	private String format(Grade grade) {
		return String.format("%s:%d", grade.getName(), gradeCount(grade));
	}
	
	
	private long gradeCount(Grade grade) {
		return getScores().stream().filter(grade::include).count();
	}
}
