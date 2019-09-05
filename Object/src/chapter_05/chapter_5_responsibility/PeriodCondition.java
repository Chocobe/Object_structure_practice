package chapter_05.chapter_5_responsibility;

import java.time.DayOfWeek;
import java.time.LocalTime;

// DiscountCondition 역할을 할당 -> implements DiscountCondition
public class PeriodCondition implements DiscountCondition {
	private DayOfWeek dayOfWeek;
	private LocalTime startTime;
	private LocalTime endTime;
	
	
	public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
		this.dayOfWeek = dayOfWeek;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	
	public boolean isSatisfiedBy(Screening screening) {
		return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
			   startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
			   endTime.compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
	}
}
