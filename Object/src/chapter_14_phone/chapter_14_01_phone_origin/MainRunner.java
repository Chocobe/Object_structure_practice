package chapter_14_phone.chapter_14_01_phone_origin;

import java.time.Duration;

public class MainRunner {
	public static void main(String[] args) {
		Phone phone_1 = new Phone(new RegularPolicy(
						Money.wons(10), Duration.ofSeconds(10)));
		
		Phone phone_2 = new Phone(new NightlyDiscountPolicy(
						Money.wons(5), Money.wons(10), 
						Duration.ofSeconds(10)));
	}
}
