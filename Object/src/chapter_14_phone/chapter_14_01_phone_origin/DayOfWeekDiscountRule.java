package chapter_14_phone.chapter_14_01_phone_origin;

import java.time.DayOfWeek;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DayOfWeekDiscountRule {
	private List<DayOfWeek> dayOfWeeks = new ArrayList<DayOfWeek>();
	private Duration duration;
	private Money amount;
	
	
// 생성자
	public DayOfWeekDiscountRule(
					List<DayOfWeek> dayOfWeeks,
					Duration duration,
					Money amount) {
		this.dayOfWeeks = dayOfWeeks;
		this.duration = duration;
		this.amount = amount;
	}
	
	
	public Money calculate(DateTimeInterval interval) {
		if(dayOfWeeks.contains(interval.getFrom().getDayOfWeek())) {
			return amount.times(
							interval.duration().getSeconds() / duration.getSeconds());
		}
		
		return Money.ZERO;
	}
}
