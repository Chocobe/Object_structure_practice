package chapter_14_phone.chapter_14_01_phone_origin;

import java.time.Duration;

public class RegularPolicy extends BasicRatePolicy {
	private Money amount;
	private Duration seconds;
	
	public RegularPolicy(Money amount, Duration seconds) {
		this.amount = amount;
		this.seconds = seconds;
	}
	
	@Override
	protected Money calculateCallFee(Call call) {
		return amount.times(call.getSeconds().getSeconds() / seconds.getSeconds());
	}
}
