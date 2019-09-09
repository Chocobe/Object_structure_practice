package chapter_11_composition.chapter_11_02_phone_combine_policy;

import java.time.Duration;

public class RateDiscountableRegularPhone extends RegularPhone {
	private Money discountAmount;
	
	
	public RateDiscountableRegularPhone(Money amount,
					Duration duration, Money discountAmount) {
		super(amount, duration);
		this.discountAmount = discountAmount;
	}
	
	
	@Override
	protected Money afterCalculated(Money fee) {
		return fee.minus(discountAmount);
	}
}
