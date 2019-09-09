package chapter_10_inheritance.chapter_10_phone.chapter_10_02_phone_fixed_typeCode;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Phone {
	private static final int LATE_NIGHT_HOUR = 22;
	
	enum PhoneType {
		REGULAR,
		NIGHTLY
	}
	
	private PhoneType type;
	
	private Money amount;
	private Money regularAmount;
	private Money nightlyAmount;
	private Duration seconds;
	private double taxRate;
	private List<Call> calls = new ArrayList<Call>();
	
	
// 생성자
	public Phone(Money amount, Duration seconds, double taxRate) {
		this(PhoneType.REGULAR, amount, Money.ZERO, Money.ZERO, seconds, taxRate);
	}
	
	public Phone(Money nightlyAmount, Money regularAmount, Duration seconds, double taxRate) {
		this(PhoneType.NIGHTLY, Money.ZERO, nightlyAmount, regularAmount, seconds, taxRate);
	}
	
	public Phone(PhoneType type, Money amount, Money nightlyAmount, 
					Money regularAmount, Duration seconds, double taxRate) {
		this.type = type;
		this.amount = amount;
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
	
	
// 단위요금 getter
	public Money getAmount() {
		return amount;
	}
	
	public Money getNightlyAmount() {
		return nightlyAmount;
	}
	
	public Money getRegularAmount() {
		return regularAmount;
	}
	
	
// 단위시간 getter
	public Duration getSeconds() {
		return seconds;
	}
	
	
// 요금 계산하기
	public Money calculateFee() {
		Money result = Money.ZERO;
		
		for(Call call : calls) {
			if(type == PhoneType.REGULAR) {
				result.plus(amount.times(
								call.getDuration().getSeconds() / seconds.getSeconds()));
				
			} else {
				if(call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
					result = result.plus(nightlyAmount.times(
									call.getDuration().getSeconds() / seconds.getSeconds()));
					
				} else {
					result = result.plus(regularAmount.times(
									call.getDuration().getSeconds() / seconds.getSeconds()));
				}
			}
		}		
		
		return result.plus(result.times(taxRate));
		
		
//		Money result = Money.ZERO;
//		
//		for(Call call : calls) {
//			result = result.plus(amount.times(
//							call.getDuration().getSeconds() / seconds.getSeconds()));
//		}
//		
//		return result.plus(result.times(taxRate));
	}
}
