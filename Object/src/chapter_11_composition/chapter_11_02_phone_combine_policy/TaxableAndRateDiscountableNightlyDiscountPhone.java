package chapter_11_composition.chapter_11_02_phone_combine_policy;

import java.time.Duration;

public class TaxableAndRateDiscountableNightlyDiscountPhone 
			extends TaxableNightlyDiscountPhone {
	private Money discountAmount;
	
	
	public TaxableAndRateDiscountableNightlyDiscountPhone(
				Money nightlyAmount, Money regularAmount,
				Duration seconds, double taxRate, Money discountAmount) {
		super(nightlyAmount, regularAmount, seconds, taxRate);
		this.discountAmount = discountAmount;
	}
	
	
	@Override
	protected Money afterCalculated(Money fee) {
		return super.afterCalculated(fee).minus(discountAmount);
	}
}
