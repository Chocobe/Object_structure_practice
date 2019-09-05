package chapter_10_inheritance.chapter_10_phone.chapter_10_phone_fixed_inheritance_2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NightlyDiscountPhone {
	private static final int LATE_NIGHT_HOUR = 22;
	
	private Money nightlyAmount;
	private Money regularAmount;
	private Duration seconds;
	private List<Call> calls = new ArrayList<Call>();
	
	
// 생성자
	public NightlyDiscountPhone(Money nightlyAmount, 
					Money regularAmount, Duration seconds) {
		this.nightlyAmount = nightlyAmount;
		this.regularAmount = regularAmount;
		this.seconds = seconds;
	}
	
	
// 요금 계산하기
	public Money calculateFee() {
		Money result = Money.ZERO;
		
		for(Call call : calls) {
			if(call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
				result = result.plus(nightlyAmount.times(
								call.getDuration().getSeconds() / seconds.getSeconds()));
				
			} else {
				result = result.plus(regularAmount.times(
								call.getDuration().getSeconds() / seconds.getSeconds()));
			}
		}
		
		return result;
	}
}
