package chapter_04.chapter_4_pop_origin;

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
	
	
// movieType 
	// accessor
	public MovieType getMovieType() {
		return movieType;
	}
	
	// mutator
	public void setMovieType(MovieType movieType) {
		this.movieType = movieType;
	}
	
	
// fee 
	// accessor
	public Money getFee() {
		return fee;
	}
	
	// mutator
	public void setFee(Money fee) {
		this.fee = fee;
	}
	
	
// discountCondition
	// accessor
	public List<DiscountCondition> getDiscountConditions() {
		return discountConditions;
	}
	
	// mutator
	public void setDiscountConditions(List<DiscountCondition> discountConditions) {
		this.discountConditions = discountConditions;
	}
	
	
// discountAmount
	// accessor
	public Money getDiscountAmount() {
		return discountAmount;
	}
	
	// mutator
	public void setDiscountAmount(Money discountAmount) {
		this.discountAmount = discountAmount;
	}
	
	
// discountPercent
	// accessor
	public double getDiscountPercent() {
		return discountPercent;
	}
	
	// mutator
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
}
