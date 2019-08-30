package chapter_5_refactoring;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {
	private DiscountConditionType type;
	
	private int sequence;
	
	private DayOfWeek dayOfWeek;
	private LocalTime startTime;
	private LocalTime endTime;
	
	
// type
	// accessor
	public DiscountConditionType getType() {
		return type;
	}
	
	// mutator
	public void setType(DiscountConditionType type) {
		this.type = type;
	}
	

// sequence
	// accessor
	public int getSequence() {
		return sequence;
	}
	
	// mutator
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	
	
// dayOfWeek
	// accessor
	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}
	
	// mutator
	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	
	
// startTime
	// accessor
	public LocalTime getStartTime() {
		return startTime;
	}
	
	// mutator
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	

// endTime
	// accessor
	public LocalTime getEndTime() {
		return endTime;
	}
	
	// mutator
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
}
