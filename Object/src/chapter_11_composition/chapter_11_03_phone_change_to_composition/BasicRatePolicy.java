package chapter_11_composition.chapter_11_03_phone_change_to_composition;

public abstract class BasicRatePolicy implements RatePolicy {
	@Override
	public Money calculateFee(Phone phone) {
		Money result = Money.ZERO;
		
		for(Call call : phone.getCalls()) {
			result = result.plus(calculateCallFee(call));
		}
		
		return result;
	}
	
	protected abstract Money calculateCallFee(Call call);
}
