package chapter_11_composition.chapter_11_02_phone_combine_policy;

import java.time.Duration;

public class TaxableNightlyDiscountPhone extends NightlyDiscountPhone {
	private double taxRate;
	
	
	public TaxableNightlyDiscountPhone(Money nightlyAmount, 
					Money regularAmount, Duration duration, double taxRate) {
		super(nightlyAmount, regularAmount, duration);
		this.taxRate = taxRate;
	}
	
	
	@Override
	protected Money afterCalculated(Money fee) {
		return fee.plus(fee.times(taxRate));
	}
}
