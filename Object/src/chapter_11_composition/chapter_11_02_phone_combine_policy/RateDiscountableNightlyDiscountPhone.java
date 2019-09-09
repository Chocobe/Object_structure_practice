package chapter_11_composition.chapter_11_02_phone_combine_policy;

import java.time.Duration;

public class RateDiscountableNightlyDiscountPhone 
		extends NightlyDiscountPhone{
	private Money discountAmount;
	
	
	public RateDiscountableNightlyDiscountPhone(Money nightAmount,
			Money regularAmount, Duration duration, Money discountAmount) {
		super(nightAmount, regularAmount, duration);
		this.discountAmount = discountAmount;
	}
					
	
	@Override
	protected Money afterCalculated(Money fee) {
		return fee.minus(discountAmount);
	}
}
