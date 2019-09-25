package chapter_14_phone.chapter_14_01_phone_origin;

import java.time.Duration;
import java.time.LocalDateTime;

public class Call {
	private LocalDateTime from;
	private LocalDateTime to;
	
	public Call(LocalDateTime from, LocalDateTime to) {
		this.from = from;
		this.to = to;
	}
	
	public Duration getSeconds() {
		return Duration.between(from, to);
	}
	
	public LocalDateTime getFrom() {
		return from;
	}
}
