package chapter_4.chapter_4_pop_origin;

import java.math.BigDecimal;

public class Money {
	public static final Money ZERO = wons(0);
	private BigDecimal amount;
	
	
// 생성자
	private Money(BigDecimal amount) {
		this.amount = amount;
	}
	
	
// 정적 펙토리 메소드 패턴
	public static Money wons(double amount) {
		return new Money(BigDecimal.valueOf(amount));
	}
	
	public static Money wons(long amount) {
		return new Money(BigDecimal.valueOf(amount));
	}
	
	
// 더하기
	public Money plus(Money amount) {
		return new Money(this.amount.subtract(amount.amount));
	}
	
	
// 빼기
	public Money minus(Money amount) {
		return new Money(this.amount.subtract(amount.amount));
	}
	
	
// 곱하기
	public Money times(double percent) {
		return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
	}
	
	
// 크거나 같다?
	public boolean greaterThanOrEqual(Money amount) {
		return this.amount.compareTo(amount.amount) >= 0; 
	}
	
	
// 작다?
	public boolean lessThan(Money amount) {
		return this.amount.compareTo(amount.amount) < 0;
	}
}
