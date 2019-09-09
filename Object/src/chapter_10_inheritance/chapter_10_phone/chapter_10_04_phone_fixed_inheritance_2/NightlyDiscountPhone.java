package chapter_10_inheritance.chapter_10_phone.chapter_10_04_phone_fixed_inheritance_2;

import java.time.Duration;

public class NightlyDiscountPhone extends Phone {
	private static final int LATE_NIGHT_HOUR = 22;
	
	private Money nightlyAmount;
	private Money regularAmount;
	private Duration seconds;

	// 추상 클래스로 이동
//	private List<Call> calls = new ArrayList<Call>();
	
	
// 생성자
	public NightlyDiscountPhone(Money nightlyAmount, 
					Money regularAmount, Duration seconds, double taxRate) {
		super(taxRate);
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
	

	// 추상 클래스로 이동
//// 요금 계산하기
//	public Money calculateFee() {
//		Money result = Money.ZERO;
//		
//		for(Call call : calls) {
//			result = result.plus(calculateCallFee(call));
//		}
//		
//		return result;
//	}
}
