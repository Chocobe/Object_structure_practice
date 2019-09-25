package chapter_14_phone.chapter_14_01_phone_origin;

import java.time.Duration;
import java.time.LocalDateTime;

public class Call {
	DateTimeInterval interval;
	
	
	public Call(LocalDateTime from, LocalDateTime to) {
		this.interval = DateTimeInterval.of(from, to);
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
