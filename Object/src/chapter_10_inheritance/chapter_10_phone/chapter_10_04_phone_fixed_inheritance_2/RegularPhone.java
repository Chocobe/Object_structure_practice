package chapter_10_inheritance.chapter_10_phone.chapter_10_04_phone_fixed_inheritance_2;

import java.time.Duration;

public class RegularPhone extends Phone {
	private Money amount;
	private Duration seconds;

	// 추상 클래스로 이동
//	private List<Call> calls = new ArrayList<Call>();
	
	
// 생성자
	public RegularPhone(Money amount, Duration seconds, double taxRate) {
		super(taxRate);
		this.amount = amount;
		this.seconds = seconds;
	}
	
	
// Call 하나에 대한 요금 계산
	@Override
	protected Money calculateCallFee(Call call) {
		return amount.times(call.getDuration().getSeconds() / seconds.getSeconds()); 
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
