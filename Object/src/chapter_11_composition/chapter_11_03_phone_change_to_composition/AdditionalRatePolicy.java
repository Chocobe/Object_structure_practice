package chapter_11_composition.chapter_11_03_phone_change_to_composition;

public abstract class AdditionalRatePolicy implements RatePolicy {
	private RatePolicy next;
	
	public AdditionalRatePolicy(RatePolicy next) {
		this.next = next;
	}
	
	@Override
	public Money calculateFee(Phone phone) {
		Money fee = next.calculateFee(phone);
		return afterCalculated(fee);
	}
	
	protected abstract Money afterCalculated(Money fee);
}
