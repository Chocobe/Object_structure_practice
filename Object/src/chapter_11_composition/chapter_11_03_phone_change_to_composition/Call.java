package chapter_11_composition.chapter_11_03_phone_change_to_composition;

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
