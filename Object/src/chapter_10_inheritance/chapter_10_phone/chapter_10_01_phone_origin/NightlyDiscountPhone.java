package chapter_10_inheritance.chapter_10_phone.chapter_10_01_phone_origin;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NightlyDiscountPhone {
	private static final int LATE_NIGHT_HOUR = 22;
	
	private Money nightlyAmount;
	private Money regularAmount;
	private Duration seconds;
	private double taxRate;
	private List<Call> calls = new ArrayList<Call>();
	
	
// 생성자
	public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, 
					Duration seconds, double taxRate) {
		this.nightlyAmount = nightlyAmount;
		this.regularAmount = regularAmount;
		this.seconds = seconds;
		this.taxRate = taxRate;
	}
	
	
// 전화하기
	public void call(Call call) {
		calls.add(call);
	}
	
	
// 통화내역 getter
	public List<Call> getCalls() {
		return calls;
	}
	
	
// 기본 단위요금 getter
	public Money getRegularAmount() {
		return regularAmount;
	}
	
	
// 할인 단위요금 getter
	public Money getNightlyAmount() {
		return nightlyAmount;
	}
	
	
// 단위시간 getter
	public Duration getSeconds() {
		return seconds;
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
		
		return result.minus(result.times(taxRate));
	}
}
