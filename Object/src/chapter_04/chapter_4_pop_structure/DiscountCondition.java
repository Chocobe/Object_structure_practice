package chapter_04.chapter_4_pop_structure;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {
	private DiscountConditionType type;
	
	private int sequence;
	
	private DayOfWeek dayOfWeek;
	private LocalTime startTime;
	private LocalTime endTime;
	

// 할인 조건
	public DiscountConditionType getType() {
		return type;
	}
	
	
// 할인 조건에 맞는가?
	// 기간조건 Overloading
	public boolean isDiscountable(DayOfWeek dayOfWeek, LocalTime time) {
		if(type != DiscountConditionType.PERIOD) {
			throw new IllegalArgumentException();
			
		}
		
		return this.dayOfWeek.equals(dayOfWeek) &&
			   startTime.compareTo(time) <= 0 &&
			   endTime.compareTo(time) >= 0;
	}
	
	
	// 순번조건 Overloading
	public boolean isDiscountable(int sequence) {
		if(type != DiscountConditionType.SEQUENCE) {
			throw new IllegalArgumentException();
		}
		
		return this.sequence == sequence;
	}
	
	
// 캡슐화를 위한 변경
	
//// type
//	// accessor
//	public DiscountConditionType getType() {
//		return type;
//	}
//	
//	// mutator
//	public void setType(DiscountConditionType type) {
//		this.type = type;
//	}
//	
//	
//// sequence
//	// accessor
//	public int getSequence() {
//		return sequence;
//	}
//	
//	// mutator
//	public void setSequence(int sequence) {
//		this.sequence = sequence;
//	}
//	
//	
//// dayOfWeek
//	public DayOfWeek getDayOfWeek() {
//		return dayOfWeek;
//	}
//	
//	public void setDayOfWeek(DayOfWeek dayOfWeek) {
//		this.dayOfWeek = dayOfWeek;
//	}
//	
//	
//// startTime
//	// accessor
//	public LocalTime getStartTime() {
//		return startTime;
//	}
//	
//	// mutator
//	public void setStartTime(LocalTime startTime) {
//		this.startTime = startTime;
//	}
//	
//	
//// endTime
//	// accessor
//	public LocalTime getEndTime() {
//		return endTime;
//	}
//	
//	// mutator
//	public void setEndTime(LocalTime endTime) {
//		this.endTime = endTime;
//	}
}
