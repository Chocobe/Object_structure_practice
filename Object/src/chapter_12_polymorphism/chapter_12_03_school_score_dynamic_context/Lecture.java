package chapter_12_polymorphism.chapter_12_03_school_score_dynamic_context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {
	private int pass;
	private String title;
	private List<Integer> scores = new ArrayList<Integer>();
	
	
// 생성자
	public Lecture(String title, int pass, List<Integer> scores) {
		this.title = title;
		this.pass = pass;
		this.scores = scores;
	}
	
	
	public String stats() {
		return String.format("Title: %s, Evaluation Method: %s", 
						title, getEvaluationMethod());
	}
	
	
	public String getEvaluationMethod() {
		return "Pass or Fail";
	}
	
	
	public double average() {
		return scores.stream().
						mapToInt(Integer::intValue).
						average().orElse(0);
	}
	
	
	public List<Integer> getScores() {
		return Collections.unmodifiableList(scores);
	}
	
	
	public String evaluate() {
		return String.format(
						"Pass : %d Fail : %d", passCount(), failCount());
	}
	
	
	private long passCount() {
		return scores.stream().filter(score -> score >= pass).count();
	}
	
	
	private long failCount() {
		return scores.size() - passCount();
	}
}
