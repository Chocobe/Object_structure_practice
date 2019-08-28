package chapter_5_responsibility;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {
	private DiscountConditionType type;
	
	private int sequence;
	
	private DayOfWeek dayOfWeek;
	private LocalTime startTime;
	private LocalTime endTime;
	
	
// screening은 이 조건에 만족하는가?
	public boolean isSatisfiedBy(Screening screening) {
		if(type == DiscountConditionType.PERIOD) {
			return isSatisfiedByPeriod(screening);
		}
		
		return isSatisfiedBySequence(screening);
	}
	
	
// 기간조건에 만족하는가?
	private boolean isSatisfiedByPeriod(Screening screening) {
		return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
						startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
						endTime.compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
	}
	
	
// 순번조건에 만족하는가?
	private boolean isSatisfiedBySequence(Screening screening) {
		return sequence == screening.getSequence();
	}
}
