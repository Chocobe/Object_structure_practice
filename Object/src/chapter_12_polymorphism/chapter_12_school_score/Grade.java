package chapter_12_polymorphism.chapter_12_school_score;

public class Grade {
	private String name;
	private int upper;
	private int lower;
	
	
// 생성자
	public Grade(String name, int upper, int lower) {
		this.name = name;
		this.upper = upper;
		this.lower = lower;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public boolean isName(String name) {
		return this.name.equals(name);
	}
	
	
	public boolean include(int score) {
		return score >= lower && score <= upper;
	}
}
