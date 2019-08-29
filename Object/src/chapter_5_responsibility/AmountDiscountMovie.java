package chapter_5_responsibility;

import java.time.Duration;

public class AmountDiscountMovie extends Movie {
	private Money discountAmount;
	
	
// 생성자
	public AmountDiscountMovie(String title, Duration runningTime, Money fee,
					Money discountAmount, DiscountCondition ...conditions) {
		super(title, runningTime, fee, conditions);
		this.discountAmount = discountAmount;
	}
	
	
	@Override
	public Money calculateDiscountAmount() {
		return discountAmount;
	}
}
