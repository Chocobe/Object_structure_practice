package chapter_11_composition.chapter_11_02_phone_combine_policy;

import java.time.Duration;

public class RegularPhone extends Phone {
	private Money amount;
	private Duration seconds;
	
	
// 생성자
	public RegularPhone(Money amount, Duration seconds) {
		this.amount = amount;
		this.seconds = seconds;
	}
	
	
// Call 하나에 대한 요금 계산
	@Override
	protected Money calculateCallFee(Call call) {
		return amount.times(call.getDuration().getSeconds() / seconds.getSeconds()); 
	}
}
