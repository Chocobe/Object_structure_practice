package chapter_10_phone.chapter_10_phone_origin;

import java.time.Duration;
import java.time.LocalDateTime;

public class MainSystem {
	public static void main(String[] args) {
		Phone phone = new Phone(Money.wons(5), Duration.ofSeconds(10));
		
		phone.call(new Call(
						LocalDateTime.of(2018,  1, 1, 12, 10, 0), 
						LocalDateTime.of(2018, 1, 1, 12, 11, 0)));
		
		phone.call(new Call(
						LocalDateTime.of(2018,  1, 2, 12, 10, 0),
						LocalDateTime.of(2018, 1, 2, 12, 11, 0)));
		
		phone.calculateFee().printer();
		
		
		NightlyDiscountPhone nightPhone = new NightlyDiscountPhone(
						Money.wons(2), Money.wons(5), Duration.ofSeconds(10));
		
		
	}
}
