package chapter_11_composition.chapter_11_03_phone_change_to_composition;

public class RateDiscountablePolicy extends AdditionalRatePolicy {
	private Money discountAmount;
	
	public RateDiscountablePolicy(Money discountAmount, RatePolicy next) {
		super(next);
		this.discountAmount = discountAmount;
	}
	
	@Override
	protected Money afterCalculated(Money fee) {
		return fee.minus(discountAmount);
	}
}