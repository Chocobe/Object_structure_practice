package chapter_2_movie;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MainRunner {
	public static void main(String[] args) {
		Movie avatar = new Movie("아바타", Duration.ofMinutes(120),
						Money.wons(10000), new AmountDiscountPolicy(
								Money.wons(800), 
								new SequenceCondition(1),
								new SequenceCondition(10),
								new PeriodCondition(DayOfWeek.MONDAY, 
										LocalTime.of(10, 0), 
										LocalTime.of(11, 59)),
								new PeriodCondition(DayOfWeek.THURSDAY,
										LocalTime.of(18, 0),
										LocalTime.of(20, 59))));
		
		Movie titanic = new Movie("타이타닉", Duration.ofMinutes(180),
						Money.wons(11000), new PercentDiscountPolicy(
								0.1,
								new PeriodCondition(DayOfWeek.TUESDAY,
										LocalTime.of(14, 0),
										LocalTime.of(16, 59)),
								new SequenceCondition(2),
								new PeriodCondition(DayOfWeek.THURSDAY,
										LocalTime.of(10, 0),
										LocalTime.of(13, 59))));
		
		Movie starWars = new Movie("스타워즈", Duration.ofHours(210),
						Money.wons(10000), new NoneDiscountPolicy());
		
		Screening screening = new Screening(
						avatar, 
						10, 
						LocalDateTime.of(LocalDate.now(), LocalTime.now()));
	}
}
