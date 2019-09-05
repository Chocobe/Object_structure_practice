package chapter_10_inheritance.chapter_10_phone.chapter_10_phone_fixed_inheritance_2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Phone {
	private Money amount;
	private Duration seconds;
	private List<Call> calls = new ArrayList<Call>();
	
	
// 생성자
	public Phone(Money amount, Duration seconds) {
		this.amount = amount;
		this.seconds = seconds;
	}
	
	
// 요금 계산하기
	public Money calculateFee() {
		Money result = Money.ZERO;
		
		for(Call call : calls) {
			result = result.plus(amount.times(
							call.getDuration().getSeconds() / seconds.getSeconds()));
		}
		
		return result;
	}
}
