package chapter_5_responsibility;

import java.math.BigDecimal;

public class Money {
	public static final Money ZERO = Money.wons(0);
		
	private final BigDecimal amount;
	
	
// 생성자
	Money(BigDecimal amount) {
		this.amount = amount;
	}
	
	
// 정적 팩토리 메소드 패턴
	public static Money wons(double amount) {
		return new Money(BigDecimal.valueOf(amount));
	}
	
	public static Money wons(long amount) {
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
	public Money times(double percent) {
		return new Money(BigDecimal.valueOf(percent));
	}
	
	
// ~보다 작다
	public boolean isLessThan(Money amount) {
		return this.amount.compareTo(amount.amount) < 0; 
	}
	
	
// ~보다 크거나 같다.
	public boolean isGreaterThanOrEqual(Money amount) {
		return this.amount.compareTo(amount.amount) >= 0; 
	}
}
