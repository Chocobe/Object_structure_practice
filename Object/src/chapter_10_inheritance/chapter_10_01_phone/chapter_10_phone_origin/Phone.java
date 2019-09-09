package chapter_10_inheritance.chapter_10_01_phone.chapter_10_phone_origin;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Phone {
	private Money amount;
	private Duration seconds;
	private double taxRate;
	private List<Call> calls = new ArrayList<Call>();
	
	
// 생성자
	public Phone(Money amount, Duration seconds, double taxRate) {
		this.amount = amount;
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
	
	
// 단위시간 getter
	public Duration getSeconds() {
		return seconds;
	}
	
	
// 요금 계산하기
	public Money calculateFee() {
		Money result = Money.ZERO;
		
		for(Call call : calls) {
			result = result.plus(amount.times(
							call.getDuration().getSeconds() / seconds.getSeconds()));
		}
		
		return result.plus(result.times(taxRate));
	}
}
