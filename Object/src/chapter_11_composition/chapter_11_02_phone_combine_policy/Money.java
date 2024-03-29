package chapter_11_composition.chapter_11_02_phone_combine_policy;

import java.math.BigDecimal;

public class Money {
	private BigDecimal amount;
	public static final Money ZERO = wons(0);

// 생성자
	private Money(BigDecimal amount) {
		this.amount = amount;
	}
	
	
// 펙토리 메소드 패턴
	public static Money wons(long amount) {
		return new Money(BigDecimal.valueOf(amount));
	}
	
	public static Money wons(double amount) {
		return new Money(BigDecimal.valueOf(amount));
	}
	
	
// 더하기
	public Money plus(Money amount) {
		return new Money(this.amount.add(amount.amount));
	}
	
	
// 빼기
	public Money minus(Money amount) {
		return new Money(this.amount.subtract(amount.amount));
	}
	
	
// 곱하기
	public Money times(double amount) {
		return new Money(this.amount.multiply(BigDecimal.valueOf(amount)));
	}
	
	
// 테스트용
	public void printer() {
		System.out.println(amount + " 원 입니다");
	}
}
