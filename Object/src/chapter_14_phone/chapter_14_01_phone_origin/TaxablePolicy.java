package chapter_14_phone.chapter_14_01_phone_origin;

public class TaxablePolicy extends AdditionalRatePolicy {
	private double taxRatio;
	
	public TaxablePolicy(double taxRatio, RatePolicy next) {
		super(next);
		this.taxRatio = taxRatio;
	}
	
	@Override
	protected Money afterCalculated(Money fee) {
		return fee.plus(fee.times(taxRatio));
	}
}
