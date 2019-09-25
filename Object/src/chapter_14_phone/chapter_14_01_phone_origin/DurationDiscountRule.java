package chapter_14_phone.chapter_14_01_phone_origin;

import java.time.Duration;

public class DurationDiscountRule extends FixedFeePolicy {
	private Duration from;
	private Duration to;
	
	
// 생성자
	public DurationDiscountRule (
					Duration from,
					Duration to,
					Money amount,
					Duration seconds) {
		super(amount, seconds);
		this.from = from;
		this.to = to;
	}
	
	
	public Money calculate(Call call) {
		if(call.getDuration().compareTo(to) > 0) {
			return Money.ZERO;
		}
		
		if(call.getDuration().compareTo(from) < 0) {
			return Money.ZERO;
		}
		
		Phone phone = new Phone(null);
		phone.call(new Call(
						call.getFrom().plus(from),
						call.getDuration().compareTo(to) > 0 ?
								call.getFrom().plus(to) :
								call.getTo()));
		
		return super.calculateFee(phone);
	}
}
