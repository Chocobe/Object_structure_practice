package chapter_11_composition.chapter_11_02_phone_combine_policy;

import java.time.Duration;

public class RateDiscountableAndTaxableRegularPhone 
				extends RateDiscountableRegularPhone {
	private double taxRate;
	
	
	public RateDiscountableAndTaxableRegularPhone(Money regularAmount, 
				Duration seconds, Money discountAmount, double taxRate) {
		super(regularAmount, seconds, discountAmount);
		this.taxRate = taxRate;		
	}
	
	
	@Override
	protected Money afterCalculated(Money fee) {
		return super.afterCalculated(fee).plus(fee.times(taxRate));
	}
}
