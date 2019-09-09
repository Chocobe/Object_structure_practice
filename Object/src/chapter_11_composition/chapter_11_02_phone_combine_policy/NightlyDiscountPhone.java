package chapter_11_composition.chapter_11_02_phone_combine_policy;

import java.time.Duration;

public class NightlyDiscountPhone extends Phone {
	private static final int LATE_NIGHT_HOUR = 22;
	
	private Money nightlyAmount;
	private Money regularAmount;
	private Duration seconds;

	
// 생성자
	public NightlyDiscountPhone(Money nightlyAmount, 
					Money regularAmount, Duration seconds) {
		this.nightlyAmount = nightlyAmount;
		this.regularAmount = regularAmount;
		this.seconds = seconds;
	}
	
	
// Call 하나에 대한 요금 계산
	@Override
	protected Money calculateCallFee(Call call) {		
		if(call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
			return nightlyAmount.times(call.getDuration().getSeconds() / seconds.getSeconds());
			
		} else {
			return regularAmount.times(call.getDuration().getSeconds() / seconds.getSeconds());
		}
	}
	
	
	// 반복되므로, 부모클래스에서 정의
//	@Override
//	protected Money afterCalculated(Money fee) {
//		return fee;
//	}
}
