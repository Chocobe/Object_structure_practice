package chapter_4_pop_structure;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class Movie {
	private String title;
	private Duration ruuningTime;
	private Money fee;
	private List<DiscountCondition> discountConditions;
	
	private MovieType movieType;		// 할인정책
	private Money discountAmount;		// 금액할인일 때 할인가
	private double discountPercent;		// 비율할인일 때 할인비율
	
	
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
	public List<DiscountCondition> getDiscountCondition() {
		// read-only 제약조건을 부여하여 값 반환 (Collections 한정 메소드)
		return Collections.unmodifiableList(discountConditions);
	}
	
	// mutator
	public void setDiscountCondition(
					List<DiscountCondition> discountConditions) {
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
	//accessor
	public double getDiscountPercent() {
		return discountPercent;
	}
	
	// mutator
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
}