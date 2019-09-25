package chapter_14_phone.chapter_14_01_phone_origin;

import java.math.BigDecimal;

public class Money {
	public static Money ZERO = wons(0);
	private BigDecimal amount;
	
	
	private Money(BigDecimal amount) {
		this.amount = amount;
	}
	
	public static Money wons(double amount) {
		return new Money(BigDecimal.valueOf(amount));
	}
	
	public static Money wons(long amount) {
		return new Money(BigDecimal.valueOf(amount));
	}
	
	public Money plus(Money amount) {
		return new Money(this.amount.add(amount.amount));
	}
	
	public Money minus(Money amount) {
		return new Money(this.amount.subtract(amount.amount));
	}
	
	public Money times(double percent) {
		return new Money(amount.multiply(BigDecimal.valueOf(percent)));
	}
}
