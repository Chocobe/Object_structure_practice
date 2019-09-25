package chapter_14_phone.chapter_14_01_phone_origin;

import java.time.Duration;

public class NightlyDiscountPolicy extends BasicRatePolicy {
	private static final int LATE_NIGHT_HOUR = 22;
	private Money nightlyAmount;
	private Money regularAmount;
	private Duration seconds;
	
	public NightlyDiscountPolicy(Money nightlyAmount,
					Money regularAmount, Duration seconds) {
		this.nightlyAmount = nightlyAmount;
		this.regularAmount = regularAmount;
		this.seconds = seconds;
	}
	
	@Override
	protected Money calculateCallFee(Call call) {
		if(call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
			return nightlyAmount.times(
							call.getSeconds().getSeconds() / 
							seconds.getSeconds());
			
		} else {
			return regularAmount.times(
							call.getSeconds().getSeconds() / 
							seconds.getSeconds());
		}
	}
}
