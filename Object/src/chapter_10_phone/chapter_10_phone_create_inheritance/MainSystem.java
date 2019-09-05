package chapter_10_phone.chapter_10_phone_create_inheritance;

import java.time.Duration;
import java.time.LocalDateTime;

public class MainSystem {
	public static void main(String[] args) {
		Phone phone = new Phone(Money.wons(5), Duration.ofSeconds(10), 0.1);
		
		phone.call(new Call(
						LocalDateTime.of(2018,  1, 1, 12, 10, 0), 
						LocalDateTime.of(2018, 1, 1, 12, 11, 0)));
		
		phone.call(new Call(
						LocalDateTime.of(2018,  1, 2, 12, 10, 0),
						LocalDateTime.of(2018, 1, 2, 12, 11, 0)));
		
		System.out.print("[phone] 요금 : ");
		phone.calculateFee().printer();
		System.out.println();
		
		
		NightlyDiscountPhone nightlyPhone = new NightlyDiscountPhone(
						Money.wons(2), Money.wons(5), Duration.ofSeconds(10), 0.1);
		
		nightlyPhone.call(new Call(
						LocalDateTime.of(2018, 1, 1, 12, 10, 0),
						LocalDateTime.of(2018, 1, 1, 12, 11, 0)));
		
		nightlyPhone.call(new Call(
						LocalDateTime.of(2018, 1, 2, 22, 10, 0),
						LocalDateTime.of(2018, 1, 2, 22, 11, 0)));
		
		System.out.print("[nightlyPhone] 요금 : ");
		nightlyPhone.calculateFee().printer();
		
		
//		Phone nightPhone = new Phone(
//				Money.wons(2), Money.wons(5), Duration.ofSeconds(10), 0.1);
//
//		phone.call(new Call(
//						LocalDateTime.of(2018, 1, 1, 12, 10, 0),
//						LocalDateTime.of(2018, 1, 1, 12, 11, 0)));
//		
//		phone.call(new Call(
//						LocalDateTime.of(2018, 1, 2, 12, 10, 0),
//						LocalDateTime.of(2018, 1, 2, 12, 11, 0)));
//		
//		System.out.print("[nightPhone] 요금 : ");
//		phone.calculateFee().printer();
		
		
		
		
//		NightlyDiscountPhone nightPhone = new NightlyDiscountPhone(
//						Money.wons(2), Money.wons(5), Duration.ofSeconds(10), 0.1);
//		
//		nightPhone.call(new Call(
//						LocalDateTime.of(2018, 1, 1, 12, 10, 0),
//						LocalDateTime.of(2018, 1, 1, 12, 11, 0)));
//		
//		nightPhone.call(new Call(
//						LocalDateTime.of(2018, 1, 2, 12, 10, 0),
//						LocalDateTime.of(2018, 1, 2, 12, 11, 0)));
//
//		System.out.print("[nightPhone] 요금 : ");
//		nightPhone.calculateFee().printer();
		
	}
}
