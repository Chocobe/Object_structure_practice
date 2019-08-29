package practice_2019_08_29;

import java.math.BigDecimal;

public class Money {
	public static final Money ZERO = wons(0);
	private BigDecimal amount;
	
	
// 생성자(정적 펙토리 메소드 패턴)
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
		return new Money(this.amount.add(amount.amount));
	}
	
	
// 빼기
	public Money minus(Money amount) {
		return new Money(this.amount.subtract(amount.amount));
	}
	
	
// 크거나 같은가?
	public boolean greaterThanOrEqual(Money amount) {
		return this.amount.compareTo(amount.amount) >= 0;
	}
	
	
// 적은가?
	public boolean lessThan(Money amount) {
		return this.amount.compareTo(amount.amount) < 0; 
	}
	
	
// 같은가?
	public boolean equal(Money amount) {
		return this.amount.compareTo(amount.amount) == 0;
	}
	
	
// 돈 출력
	public void printAmount() {
		System.out.println("[돈] : " + amount + " 원");
	}
	
}
