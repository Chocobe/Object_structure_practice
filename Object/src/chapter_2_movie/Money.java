package chapter_2_movie;

import java.math.BigDecimal;

public class Money {
	public static final Money ZERO = Money.wons(0);
	private final BigDecimal amount;
	
	
// 정적 펙토리 메소드
	public static Money wons(long amount) {
		return new Money(BigDecimal.valueOf(amount));
	}
	
	public static Money wons(double amount) {
		return new Money(BigDecimal.valueOf(amount));
	}
	
	
// 생성자
	Money(BigDecimal amount) {
		this.amount = amount;
	}
	
	
// plus
	public Money plus(Money amount) {
		return new Money(this.amount.add(amount.amount));
	}
	

// minus
	public Money minus(Money amount) {
		return new Money(this.amount.subtract(amount.amount));
	}
	
	
// times
	public Money times(double percent) {
		return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
	}
	
	
// isLessThan
	public boolean isLessThan(Money other) {
		return amount.compareTo(other.amount) < 0;
	}
	
	
// isGreaterThanOrEqual
	public boolean isGreaterThanOrEqual(Money other) {
		return amount.compareTo(other.amount) >= 0; 
	}
}
