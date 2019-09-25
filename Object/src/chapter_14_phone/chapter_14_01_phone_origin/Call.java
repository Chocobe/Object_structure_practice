package chapter_14_phone.chapter_14_01_phone_origin;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Call {
	DateTimeInterval interval;
	
	
	public Call(LocalDateTime from, LocalDateTime to) {
		this.interval = DateTimeInterval.of(from, to);
	}
	
	
	public List<DateTimeInterval> splitByDay() {
		return interval.splitByDay();
	}
	
	
	public Duration getDuration() {
		return interval.duration();
	}
	
	
	public LocalDateTime getFrom() {
		return interval.getFrom();
	}
	
	
	public LocalDateTime getTo() {
		return interval.getTo();
	}
	
	
	public DateTimeInterval getInterval() {
		return interval;
	}
}
