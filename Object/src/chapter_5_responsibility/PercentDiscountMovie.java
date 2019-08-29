package chapter_5_responsibility;

import java.time.Duration;

public class PercentDiscountMovie extends Movie {	
	private double percent;
	
	
// 생성자
	public PercentDiscountMovie(String title, Duration runningTime, Money fee,
					double percent, DiscountCondition ...conditions) {
		super(title, runningTime, fee, conditions);
		this.percent = percent;
	}
	
	
	@Override
	protected Money calculateDiscountAmount() {
		return getFee().times(percent);
	}
}
