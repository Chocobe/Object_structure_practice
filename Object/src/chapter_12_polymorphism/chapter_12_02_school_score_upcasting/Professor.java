package chapter_12_polymorphism.chapter_12_02_school_score_upcasting;

public class Professor {
	private String name;
	private Lecture lecture;
	
	
// 생성자
	public Professor(String name, Lecture lecture) {
		this.name = name;
		this.lecture = lecture;
	}
	
	
	public String compileStatistics() {
		return String.format("[%s] %s - Avg: %.1f",
						name, lecture.evaluate(), lecture.average());
	}
}
