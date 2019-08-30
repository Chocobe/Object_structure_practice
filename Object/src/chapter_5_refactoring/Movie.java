package chapter_5_refactoring;

import java.time.Duration;
import java.util.List;

public class Movie {
	private String title;
	private Duration runningTime;
	private Money fee;
	private List<DiscountCondition> discountConditions;
	
	
	private MovieType movieType;
	private Money discountAmount;
	private double discountPercent;
}
