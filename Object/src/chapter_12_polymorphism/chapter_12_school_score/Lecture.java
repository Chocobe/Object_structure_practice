package chapter_12_polymorphism.chapter_12_school_score;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
	private int pass;
	private String title;
	private List<Integer> scores = new ArrayList<Integer>();
	
	
	public Lecture(String title, int pass, List<Integer> scores) {
		this.title = title;
		this.pass = pass;
		this.scores = scores;
	}
	
	
	public double average() {
		return scores.stream().mapToInt(Integer::intValue).average().orElse(0F);
	}
}
