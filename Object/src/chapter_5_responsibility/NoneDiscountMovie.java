package chapter_5_responsibility;

import java.time.Duration;

public class NoneDiscountMovie extends Movie {
// 생성자
	public NoneDiscountMovie(String title, Duration runningTime, Money fee,
					DiscountCondition ...conditions) {
		super(title, runningTime, fee, conditions);
	}
	
	
	@Override
	public Money calculateDiscountAmount() {
		return Money.ZERO;
	}
}
