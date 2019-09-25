package chapter_14_phone.chapter_14_01_phone_origin;

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
