package chapter_11_composition.chapter_11_02_phone_combine_policy;

import java.time.Duration;

public class TaxableRegularPhone extends RegularPhone {
	private double taxRate;
	
	
	public TaxableRegularPhone(Money amount, 
					Duration duration, double taxRate) {
		super(amount, duration);
		this.taxRate = taxRate;
	}
	
	
	@Override
	public Money calculateFee() {
		Money fee = super.calculateFee();
//		return afterCalculated(fee);
		return fee.plus(fee.times(taxRate));
	}
	
	
	@Override
	protected Money afterCalculated(Money fee) {
		return fee.plus(fee.times(taxRate));
	}
}
