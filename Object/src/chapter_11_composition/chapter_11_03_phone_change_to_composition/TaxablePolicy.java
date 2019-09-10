package chapter_11_composition.chapter_11_03_phone_change_to_composition;

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
